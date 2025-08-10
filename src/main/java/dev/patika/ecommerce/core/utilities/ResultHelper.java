package dev.patika.ecommerce.core.utilities;

import dev.patika.ecommerce.core.result.Result;
import dev.patika.ecommerce.core.result.ResultData;
import dev.patika.ecommerce.dto.response.CursorResponse;
import dev.patika.ecommerce.dto.response.category.CategoryResponse;
import org.springframework.data.domain.Page;

public class ResultHelper {
    public static <T> ResultData<T> created(T data) {
        return new ResultData<>(true, Msg.CREATE, "201", data);
    }

    public static <T> ResultData<T> validateError(T data) {
        return new ResultData<>(false, Msg.VALIDATION_ERROR, "400", data);
    }

    public static <T> ResultData<T> success(T data) {
        return new ResultData<>(true, Msg.SUCCESS, "200", data);
    }

    public static Result notFound(String message) {
        return new Result(false, message, "404");
    }

    public static <T> ResultData<CursorResponse<T>> cursor(Page<T> pageData) {
        CursorResponse<T> cursorResponse = new CursorResponse<>();
        cursorResponse.setItems(pageData.getContent());
        cursorResponse.setPageNumber(pageData.getNumber());
        cursorResponse.setPageSize(pageData.getSize());
        cursorResponse.setTotalELements(pageData.getTotalElements());
        return ResultHelper.success(cursorResponse);
    }

    public static Result Ok() {
        return new Result(true, Msg.SUCCESS, "200");
    }
}
