package pl.rpn.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import pl.rpn.calculators.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

class RpnParserTest {

    @Mock
    private Calculator calculator;

    private RpnParser rpnParser;
    private String[] expression;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        expression = "2 7 + 3 -".split(" ");
        rpnParser=new RpnParser(calculator, expression);
    }

    @Test
    void getRpnExpressionValue() {
        //given
        Double expectedValue = 9.0;
        doReturn(9.0).when(calculator).calculate(expression);
        //when
        Double result = rpnParser.getRpnExpressionValue();
        //then
        assertEquals(expectedValue, result);
    }
}