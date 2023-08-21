package enums.task2;

public enum PackageSize {
    SMALL(1, 5),
    MEDIUM(6, 10),
    LARGE(11, 15),
    OTHER;

    int a;
    int b;

    PackageSize() {
    }

    PackageSize(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static PackageSize getPackageSize(int c){
        for (PackageSize packageSize : PackageSize.values()) {
            if (c > packageSize.a && c <= packageSize.b){
                return  packageSize;
            }
        }
        return PackageSize.OTHER;
    }
}
