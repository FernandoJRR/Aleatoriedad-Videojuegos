public class FalloutClasicoCalculador {
    public static double damg(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
    public static void main(String[] args){
        double danobase, DM, DT, DR, DRM, danofinal;

        //danobase = damg(12, 18);
        danobase = 14;
        DM = 2;
        DT = 5;
        DR = 0.4;
        DRM = 0.2;

        danofinal = ((danobase*DM)-DT)-Math.floor((DR + DRM) * ((danobase*DM)-DT));
        System.out.println("El daño ocasionado al enemigo es de "+danofinal+" HP");
    }
}
