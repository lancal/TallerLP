/* Generated By:JavaCC: Do not edit this line. Ejemplo01Sintaxis.java */
public class Ejemplo01Sintaxis implements Ejemplo01SintaxisConstants {
    public static void main(String[] args) {
        try {
            new Ejemplo01Sintaxis(new java.io.StringReader(args[0])).S();
            System.out.println("La sintaxis es CORRECTA" );
        } catch (Throwable e) {
            // Catching Throwable is ugly but JavaCC throws Error objects!
            System.out.println("Hay un ERROR en la sintaxis 2: " + e.getMessage());
        }
    }

/* Reglas Sintactivas */
  static final public void S() throws ParseException {
    Elemento();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      jj_consume_token(11);
      Elemento();
    }
  }

  static final public void Elemento() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ARTICLE:
      Article();
      break;
    case BOOK:
      Book();
      break;
    case BOOKLET:
      Booklet();
      break;
    case CONFERENCE:
      Conference();
      break;
    case INBOOK:
      Inbook();
      break;
    case INCOLLECTION:
      Incollection();
      break;
    case INPROCEEDINGS:
      Inproceedings();
      break;
    case MANUAL:
      Manual();
      break;
    case MASTERSTHESIS:
      Mastersthesis();
      break;
    case MISC:
      Misc();
      break;
    case PHDTHESIS:
      Phdthesis();
      break;
    case PROCEEDINGS:
      Proceedings();
      break;
    case TECHREPORT:
      Techreport();
      break;
    case UNPUBLISHED:
      Unpublished();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Article() throws ParseException {
    jj_consume_token(ARTICLE);
    jj_consume_token(9);
    SentenciaArticle();
    jj_consume_token(10);
  }

  static final public void Book() throws ParseException {
    jj_consume_token(BOOK);
    jj_consume_token(9);
    SentenciaBook();
    jj_consume_token(10);
  }

  static final public void Booklet() throws ParseException {
    jj_consume_token(BOOKLET);
    jj_consume_token(9);
    SentenciaBooklet();
    jj_consume_token(10);
  }

  static final public void Conference() throws ParseException {
    jj_consume_token(CONFERENCE);
    jj_consume_token(9);
    SentenciaConference();
    jj_consume_token(10);
  }

  static final public void Inbook() throws ParseException {
    jj_consume_token(INBOOK);
    jj_consume_token(9);
    SentenciaInbook();
    jj_consume_token(10);
  }

  static final public void Incollection() throws ParseException {
    jj_consume_token(INCOLLECTION);
    jj_consume_token(9);
    SentenciaIncollection();
    jj_consume_token(10);
  }

  static final public void Inproceedings() throws ParseException {
    jj_consume_token(INPROCEEDINGS);
    jj_consume_token(9);
    SentenciaInproceedings();
    jj_consume_token(10);
  }

  static final public void Manual() throws ParseException {
    jj_consume_token(MANUAL);
    jj_consume_token(9);
    SentenciaManual();
    jj_consume_token(10);
  }

  static final public void Mastersthesis() throws ParseException {
    jj_consume_token(MASTERSTHESIS);
    jj_consume_token(9);
    SentenciaMastersthesis();
    jj_consume_token(10);
  }

  static final public void Misc() throws ParseException {
    jj_consume_token(MISC);
    jj_consume_token(9);
    SentenciaMisc();
    jj_consume_token(10);
  }

  static final public void Phdthesis() throws ParseException {
    jj_consume_token(PHDTHESIS);
    jj_consume_token(9);
    SentenciaPhdthesis();
    jj_consume_token(10);
  }

  static final public void Proceedings() throws ParseException {
    jj_consume_token(PROCEEDINGS);
    jj_consume_token(9);
    SentenciaProceedings();
    jj_consume_token(10);
  }

  static final public void Techreport() throws ParseException {
    jj_consume_token(TECHREPORT);
    jj_consume_token(9);
    SentenciaTechreport();
    jj_consume_token(10);
  }

  static final public void Unpublished() throws ParseException {
    jj_consume_token(UNPUBLISHED);
    jj_consume_token(9);
    SentenciaUnpublished();
    jj_consume_token(10);
  }

  static final public void SentenciaArticle() throws ParseException {
    AtributoArticle();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      jj_consume_token(11);
      AtributoArticle();
    }
  }

  static final public void AtributoArticle() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case JOURNAL:
      Journal();
      break;
    case YEAR:
      Year();
      break;
    case VOLUME:
      Volume();
      break;
    case NUMBER:
      Number();
      break;
    case PAGES:
      Pages();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaBook() throws ParseException {
    AtributoBook();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      jj_consume_token(11);
      AtributoBook();
    }
  }

  static final public void AtributoBook() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case EDITOR:
      Editor();
      break;
    case TITLE:
      Title();
      break;
    case PUBLISHER:
      Publisher();
      break;
    case SERIES:
      Series();
      break;
    case JOURNAL:
      Journal();
      break;
    case EDITION:
      Edition();
      break;
    case YEAR:
      Year();
      break;
    case VOLUME:
      Volume();
      break;
    case NUMBER:
      Number();
      break;
    case PAGES:
      Pages();
      break;
    case MONTH:
      Month();
      break;
    case ADDRESS:
      Address();
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaBooklet() throws ParseException {
    AtributoBooklet();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_4;
      }
      jj_consume_token(11);
      AtributoBooklet();
    }
  }

  static final public void AtributoBooklet() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case HOWPUBLISHED:
      Howpublished();
      break;
    case ADDRESS:
      Address();
      break;
    case YEAR:
      Year();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaConference() throws ParseException {
    AtributoConference();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_5;
      }
      jj_consume_token(11);
      AtributoConference();
    }
  }

  static final public void AtributoConference() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case YEAR:
      Year();
      break;
    case BOOKTITTLE:
      Booktittle();
      break;
    case EDITOR:
      Editor();
      break;
    case VOLUME:
      Volume();
      break;
    case NUMBER:
      Number();
      break;
    case SERIES:
      Series();
      break;
    case PUBLISHER:
      Publisher();
      break;
    case ADDRESS:
      Address();
      break;
    case ORGANIZATION:
      Organization();
      break;
    case PAGES:
      Pages();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaInbook() throws ParseException {
    AtributoInbook();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_6;
      }
      jj_consume_token(11);
      AtributoInbook();
    }
  }

  static final public void AtributoInbook() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case JOURNAL:
      Journal();
      break;
    case EDITOR:
      Editor();
      break;
    case YEAR:
      Year();
      break;
    case VOLUME:
      Volume();
      break;
    case PUBLISHER:
      Publisher();
      break;
    case ADDRESS:
      Address();
      break;
    case CHAPTER:
      Chapter();
      break;
    case EDITION:
      Edition();
      break;
    case SERIES:
      Series();
      break;
    case TYPE:
      Type();
      break;
    case NUMBER:
      Number();
      break;
    case PAGES:
      Pages();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaIncollection() throws ParseException {
    AtributoIncollection();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_7;
      }
      jj_consume_token(11);
      AtributoIncollection();
    }
  }

  static final public void AtributoIncollection() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case JOURNAL:
      Journal();
      break;
    case BOOKTITTLE:
      Booktittle();
      break;
    case EDITOR:
      Editor();
      break;
    case TYPE:
      Type();
      break;
    case CHAPTER:
      Chapter();
      break;
    case ADDRESS:
      Address();
      break;
    case EDITION:
      Edition();
      break;
    case SERIES:
      Series();
      break;
    case PUBLISHER:
      Publisher();
      break;
    case YEAR:
      Year();
      break;
    case VOLUME:
      Volume();
      break;
    case NUMBER:
      Number();
      break;
    case PAGES:
      Pages();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[13] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaInproceedings() throws ParseException {
    AtributoInproceedings();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_8;
      }
      jj_consume_token(11);
      AtributoInproceedings();
    }
  }

  static final public void AtributoInproceedings() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case BOOKTITTLE:
      Booktittle();
      break;
    case EDITOR:
      Editor();
      break;
    case ADDRESS:
      Address();
      break;
    case SERIES:
      Series();
      break;
    case PUBLISHER:
      Publisher();
      break;
    case ORGANIZATION:
      Organization();
      break;
    case YEAR:
      Year();
      break;
    case VOLUME:
      Volume();
      break;
    case NUMBER:
      Number();
      break;
    case PAGES:
      Pages();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaManual() throws ParseException {
    AtributoManual();
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[16] = jj_gen;
        break label_9;
      }
      jj_consume_token(11);
      AtributoManual();
    }
  }

  static final public void AtributoManual() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case ORGANIZATION:
      Organization();
      break;
    case ADDRESS:
      Address();
      break;
    case YEAR:
      Year();
      break;
    case EDITION:
      Edition();
      break;
    case NUMBER:
      Number();
      break;
    case PAGES:
      Pages();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaMastersthesis() throws ParseException {
    AtributoMastersthesis();
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_10;
      }
      jj_consume_token(11);
      AtributoMastersthesis();
    }
  }

  static final public void AtributoMastersthesis() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case ADDRESS:
      Address();
      break;
    case SCHOOL:
      School();
      break;
    case TYPE:
      Type();
      break;
    case YEAR:
      Year();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaMisc() throws ParseException {
    AtributoMisc();
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[20] = jj_gen;
        break label_11;
      }
      jj_consume_token(11);
      AtributoMisc();
    }
  }

  static final public void AtributoMisc() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case HOWPUBLISHED:
      Howpublished();
      break;
    case YEAR:
      Year();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[21] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaPhdthesis() throws ParseException {
    AtributoPhdthesis();
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[22] = jj_gen;
        break label_12;
      }
      jj_consume_token(11);
      AtributoPhdthesis();
    }
  }

  static final public void AtributoPhdthesis() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case SCHOOL:
      School();
      break;
    case TYPE:
      Type();
      break;
    case ADDRESS:
      Address();
      break;
    case YEAR:
      Year();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[23] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaProceedings() throws ParseException {
    AtributoProceedings();
    label_13:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[24] = jj_gen;
        break label_13;
      }
      jj_consume_token(11);
      AtributoProceedings();
    }
  }

  static final public void AtributoProceedings() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case EDITOR:
      Editor();
      break;
    case BOOKTITTLE:
      Booktittle();
      break;
    case SERIES:
      Series();
      break;
    case ADDRESS:
      Address();
      break;
    case PUBLISHER:
      Publisher();
      break;
    case ORGANIZATION:
      Organization();
      break;
    case YEAR:
      Year();
      break;
    case VOLUME:
      Volume();
      break;
    case NUMBER:
      Number();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[25] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaTechreport() throws ParseException {
    AtributoTechreport();
    label_14:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[26] = jj_gen;
        break label_14;
      }
      jj_consume_token(11);
      AtributoTechreport();
    }
  }

  static final public void AtributoTechreport() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case TITLE:
      Title();
      break;
    case YEAR:
      Year();
      break;
    case TYPE:
      Type();
      break;
    case INSTITUTION:
      Institution();
      break;
    case ADDRESS:
      Address();
      break;
    case NUMBER:
      Number();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[27] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SentenciaUnpublished() throws ParseException {
    AtributoUnpublished();
    label_15:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        ;
        break;
      default:
        jj_la1[28] = jj_gen;
        break label_15;
      }
      jj_consume_token(11);
      AtributoUnpublished();
    }
  }

  static final public void AtributoUnpublished() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ETIQUETA:
      Etiqueta();
      break;
    case AUTHOR:
      Author();
      break;
    case NOTE:
      Note();
      break;
    case TITLE:
      Title();
      break;
    case YEAR:
      Year();
      break;
    case MONTH:
      Month();
      break;
    default:
      jj_la1[29] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Etiqueta() throws ParseException {
    jj_consume_token(ETIQUETA);
  }

  static final public void Author() throws ParseException {
    jj_consume_token(AUTHOR);
  }

  static final public void Editor() throws ParseException {
    jj_consume_token(EDITOR);
  }

  static final public void Title() throws ParseException {
    jj_consume_token(TITLE);
  }

  static final public void Publisher() throws ParseException {
    jj_consume_token(PUBLISHER);
  }

  static final public void Journal() throws ParseException {
    jj_consume_token(JOURNAL);
  }

  static final public void Year() throws ParseException {
    jj_consume_token(YEAR);
  }

  static final public void Volume() throws ParseException {
    jj_consume_token(VOLUME);
  }

  static final public void Number() throws ParseException {
    jj_consume_token(NUMBER);
  }

  static final public void Pages() throws ParseException {
    jj_consume_token(PAGES);
  }

  static final public void Month() throws ParseException {
    jj_consume_token(MONTH);
  }

  static final public void Series() throws ParseException {
    jj_consume_token(SERIES);
  }

  static final public void Address() throws ParseException {
    jj_consume_token(ADDRESS);
  }

  static final public void Edition() throws ParseException {
    jj_consume_token(EDITION);
  }

  static final public void Howpublished() throws ParseException {
    jj_consume_token(HOWPUBLISHED);
  }

  static final public void Booktittle() throws ParseException {
    jj_consume_token(BOOKTITTLE);
  }

  static final public void Organization() throws ParseException {
    jj_consume_token(ORGANIZATION);
  }

  static final public void Type() throws ParseException {
    jj_consume_token(TYPE);
  }

  static final public void Chapter() throws ParseException {
    jj_consume_token(CHAPTER);
  }

  static final public void School() throws ParseException {
    jj_consume_token(SCHOOL);
  }

  static final public void Institution() throws ParseException {
    jj_consume_token(INSTITUTION);
  }

  static final public void Note() throws ParseException {
    jj_consume_token(NOTE);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public Ejemplo01SintaxisTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[30];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x800,0xfff80000,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,0x800,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x1,0x0,0x400bd6,0x0,0x403ffe,0x0,0x406096,0x0,0x41bbbe,0x0,0x463ffe,0x0,0x46bffe,0x0,0x41bbbe,0x0,0x412e96,0x0,0x4a2096,0x0,0x404096,0x0,0x4a2096,0x0,0x41b3be,0x0,0x522296,0x0,0x600096,};
   }

  /** Constructor with InputStream. */
  public Ejemplo01Sintaxis(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Ejemplo01Sintaxis(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new Ejemplo01SintaxisTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Ejemplo01Sintaxis(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new Ejemplo01SintaxisTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Ejemplo01Sintaxis(Ejemplo01SintaxisTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(Ejemplo01SintaxisTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 30; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[55];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 30; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 55; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
