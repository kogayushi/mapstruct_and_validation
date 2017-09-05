package mapstruct_and_validation;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class CarMapperTest {

    @Test
    public void shouldMapCarToDto() {
        //given
        Car car = new Car( "Morris", 5, CarType.FUGA );
     
        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );
     
        //then
        assertThat( carDto,is(notNullValue()));
        assertThat( carDto.getMake(),equalTo( "Morris" ));
        assertThat( carDto.getSeatCount(),equalTo( 5 ));
        assertThat( carDto.getType(),equalTo( "FUGA" ));
    }

}
