package database

import (
	"first/configs"
	"sync"

	"gorm.io/gorm"
)

var ones sync.Once

var gdb *gorm.DB

func GetDBConnextion(conf *configs.DBconfigs)
