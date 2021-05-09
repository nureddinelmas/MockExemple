import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class MainTest {
    @Mock
    Database databaseMock;




   @Test
   void testQuery(){
       when(databaseMock.isAvailable()).thenReturn(true);

       Service t = new Service(databaseMock); //Dependency injection
       boolean check = t.query("* from t");
       assertTrue(check);
   }




}