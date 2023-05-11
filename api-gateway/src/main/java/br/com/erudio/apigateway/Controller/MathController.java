package br.com.erudio.apigateway.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ExceptionResponse.UnsupportedMathException;
import br.com.MathOperations.SimpleMath;
import br.com.erudio.Converter.Converter;

@RestController
public class MathController {

    private SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) {
            throw new UnsupportedMathException("Please set a numeric value!");
        }
        return math.sum(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) {
            throw new UnsupportedMathException("Please set a numeric value!");
        }
        return math.subtraction(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) {
            throw new UnsupportedMathException("Please set a numeric value!");
        }
        return math.multiplication(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) {
            throw new UnsupportedMathException("Please set a numeric value!");
        }
        return math.division(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(@PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!Converter.isNumeric(numberOne) || !Converter.isNumeric(numberTwo)) {
            throw new UnsupportedMathException("Please set a numeric value!");
        }
        return math.mean(Converter.convertToDouble(numberOne), Converter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable(value = "number") String number) throws Exception {
        if (!Converter.isNumeric(number)) {
            throw new UnsupportedMathException("Please set a numeric value!");
        }
        return math.squareRoot(Converter.convertToDouble(number));
    }

}
