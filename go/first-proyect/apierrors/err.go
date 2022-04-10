package apierrors

import (
	"errors"
	"log"
	"net/http"

	"github.com/labstack/echo/v4"
)

func logErrs(e error) {
	log.Println(e.Error())
}

func GenErrResponseEcho(c echo.Context, e error) error {
	go logErrs(e)
	code := http.StatusBadRequest
	var message string = ""
	if errors.Is(e, ErrJson) {
		message = "mensaje personalizado"
	}

	return c.JSON(code, message)
}
