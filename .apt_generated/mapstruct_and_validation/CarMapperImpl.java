package mapstruct_and_validation;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2017-07-02T23:56:47+0900",

    comments = "version: 1.1.0.Final, compiler: Eclipse JDT (IDE) 3.12.3.xx-201706301849-e46, environment: Java 1.8.0_131 (Oracle Corporation)"

)

public class CarMapperImpl implements CarMapper {

    @Override

    public CarDto carToCarDto(Car car) {

        if ( car == null ) {

            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setSeatCount( car.getNumberOfSeats() );

        carDto.setMake( car.getMake() );

        if ( car.getType() != null ) {

            carDto.setType( car.getType().name() );
        }

        return carDto;
    }
}

