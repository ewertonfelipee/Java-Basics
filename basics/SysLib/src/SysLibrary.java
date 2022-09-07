public class SysLibrary {

    private Books list[];
            boolean info; // informacao se o livro esta emprestado

    public SysLibrary(){
        list = new Books[5];
        list[0] = new Books("chapelzinho vermelho", "charles perrault", 1800, "fairy tales", 2);
        list[1] = new Books("sinfonia dos animais", "dan brown", 2000,"fairy tales", 4);
        list[2] = new Books("hunterxhunter", "yoshihiro togashi", 1999,"manga", 10);
        list[3] = new Books("o investidor de bom senso", "john C.bogle", 1973,"investments", 12);
        list[4] = new Books("antologia poetica", "C. Drummond de Andrade", 1920,"poetry", 20);
        this.info = false;
    }

}
