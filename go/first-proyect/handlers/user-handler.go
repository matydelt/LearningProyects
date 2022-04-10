package handlers

import (
	"first/apierrors"
	"first/models"
	"first/services"
	"first/utils"

	"github.com/labstack/echo/v4"
)

type UserHandler struct {
	binder  echo.DefaultBinder
	service *services.UserService
}

func NewUserHandler(s *services.UserService) *UserHandler {

	return &UserHandler{service: s, binder: echo.DefaultBinder{}}
}

func (h *UserHandler) LoginHandler(c echo.Context) error {
	request := models.RequestSession{}

	if err := h.binder.BindBody(c, &request); err != nil {
		return apierrors.GenErrResponseEcho(c, err)
	}

	user, err := h.service.Loggin(request)

	if err != nil {
		return apierrors.GenErrResponseEcho(c, err)
	}

	return utils.OkResponse(c, user)

}
