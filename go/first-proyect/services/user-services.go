package services

import (
	"errors"
	"first/models"
	"first/repositories"
	"strings"
)

type UserService struct {
	repository *repositories.UserRepository
}

func NewUserService(r *repositories.UserRepository) *UserService {
	return &UserService{repository: r}
}

func (s *UserService) Loggin(rs models.RequestSession) (*models.User, error) {

	lenName := len(strings.TrimSpace(rs.UserName))
	lenPassword := len(strings.TrimSpace(rs.Password))

	if lenName > 6 || lenPassword > 6 {
		return nil, errors.New("requiere nombre y contraseña con mas de 6 caracteres")
	}

	return s.repository.Login(rs)
}
