package models

type RequestSession struct {
	UserName string `json:"user-name"`
	Password string `json:"password"`
}

type User struct {
	UserName string `json:"userName"`
	Password string `json:"password"`
}
