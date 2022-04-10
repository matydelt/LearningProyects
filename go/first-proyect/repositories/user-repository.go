package repositories

import (
	"errors"
	"first/models"

	"gorm.io/gorm"
)

type UserRepository struct {
	conn *gorm.DB
}

func NewUserRepository(c *gorm.DB) *UserRepository {
	return &UserRepository{conn: c}
}

func (r *UserRepository) Login(rs models.RequestSession) (*models.User, error) {
	user := &models.User{}
	if res := r.conn.Find(user, "userName = ? and password = ?", rs.UserName, rs.Password); res.Error != nil {
		return nil, res.Error
	} else {
		if res.RowsAffected == 0 {

			return nil, errors.New("usuario o contraseña equivocada")
		}
	}
	return user, nil
}
