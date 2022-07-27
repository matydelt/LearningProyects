package configs

import "fmt"

type DBconfigs struct {
	Host     string
	Port     uint
	UserDB   string
	Password string
	DBName   string
}

func (d *DBconfigs) GetDBConnextionString() string {
	cadena := fmt.Sprintf(
		"port=%d host=%s user=%s "+"password=%s dbname=%s sslmode=disable",
		d.Port, d.Host, d.UserDB, d.Password, d.DBName)

	return cadena
}
