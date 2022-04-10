package injectors

import (
	"first/handlers"
	"first/repositories"
	"first/services"

	"gorm.io/gorm"
)

var (
	//DB connextion
	Connextion *gorm.DB
	//Repository
	userRepository *repositories.UserRepository

	//Services
	userService *services.UserService

	//Handlers
	userHandler *handlers.UserHandler
)
