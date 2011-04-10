package ioio.lib;



/**
 * Constants used in IOIO.
 *
 * @author birmiwal
 * @author arshan
 */
public class Constants {
  // Magic bytes for the IOIO, spells 'IOIO'
  public final static byte[] IOIO_MAGIC = { 0x49,  0x4F, 0x49, 0x4F };

  // Outgoing messages
  public static final int HARD_RESET 	= 0x00;
  public static final byte SOFT_RESET 	= 0x01;
  public static final byte SET_OUTPUT 	= 0x02;
  public static final int SET_VALUE 		= 0x03;
  public static final byte SET_INPUT 		= 0x04;
  public static final byte SET_CHANGE_NOTIFY = 0x05;
  public static final int SET_PERIODIC_SAMPLE = 0x06;
  public static final int RESERVED1 = 0x07;
  public static final int SET_PWM = 0x08;
  public static final int SET_DUTYCYCLE = 0x09;
  public static final int SET_PERIOD = 0x0A;
  public static final byte SET_ANALOG_INPUT = 0x0B;
  public static final int UART_TX = 0x0C;
  public static final int UART_CONFIGURE = 0x0D;
  public static final int UART_SET_RX = 0x0E;
  public static final int UART_SET_TX = 0x0F;
  public static final int SPI_MASTER_REQUEST = 0x10;
  public static final int SPI_CONFIGURE_MASTER = 0x12;
  public static final int SPI_SET_PIN = 0x13;
  public static final int TWI_CONFIGURE_MASTER = 0x14;
  public static final int TWI_WRITE_READ = 0x15;
  
  // Incoming messages (where different)
  public static final byte ESTABLISH_CONNECTION = 0x00;
  public static final byte REPORT_DIGITAL_STATUS = 0x03;
  public static final int REPORT_PERIODIC_DIGITAL = 0x07;
  public static final byte REPORT_ANALOG_FORMAT = 0x08;
  public static final byte REPORT_ANALOG_STATUS = 0x09;
  public static final int UART_TX_STATUS = 0x0A;
  public static final int UART_RX = 0x0C;
  public static final int SPI_DATA = 0x10;
  public static final int SPI_REPORT_TX_STATUS = 0x11;
  public static final int TWI_RESULT = 0x15;
  public static final int TWI_REPORT_TX_STATUS = 0x16;
 
    // Didnt find documentation but looking at firmware this seems right.
    public static final int IOIO_PORT = 4545;

    // Cache some packets that are static
    static final IOIOPacket HARD_RESET_PACKET = new IOIOPacket(HARD_RESET, IOIO_MAGIC);

    static final IOIOPacket SOFT_RESET_PACKET = new IOIOPacket(SOFT_RESET, null);

    static final IOIOPacket ESTABLISH_CONNECTION_PACKET = new IOIOPacket(ESTABLISH_CONNECTION, IOIO_MAGIC);

    // Where the onboard LED is connected.
    public static final int LED_PIN = 0;

    // number of PWMs on the IOIO board
    public static final int NUM_PWMS = 8;

}
