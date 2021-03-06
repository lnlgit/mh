package com.lnl.montorhome;

/**
 * Created by James Park
 * email: jim@linuxnetworks.co.uk
 * Date: 8/2/2559.
 */
public class RHCabWin extends BaseShape {

    float lineCoords[] =  {
            -0.429141f, 0.112025f, -0.25f,
            -0.494028f, -0.000527f, -0.25f,
            -0.494028f, -0.060616f, -0.25f,
            -0.425190f, -0.050015f, -0.25f,
            -0.429141f, 0.112025f, -0.25f,
            -0.300930f, 0.112025f, -0.25f,
            -0.301041f, -0.013814f, -0.25f,
            -0.301337f, -0.017576f, -0.25f,
            -0.302167f, -0.020845f, -0.25f,
            -0.303424f, -0.023652f, -0.25f,
            -0.305002f, -0.026029f, -0.25f,
            -0.306795f, -0.028008f, -0.25f,
            -0.308694f, -0.02962f, -0.25f,
            -0.310594f, -0.030897f, -0.25f,
            -0.312388f, -0.031871f, -0.25f,
            -0.313969f, -0.032573f, -0.25f,
            -0.315231f, -0.033036f, -0.25f,
            -0.316066f, -0.03329f, -0.25f,
            -0.316368f, -0.033367f, -0.25f,
            -0.317817f, -0.033591f, -0.25f,
            -0.321912f, -0.034222f, -0.25f,
            -0.328275f, -0.035204f, -0.25f,
            -0.336528f, -0.036477f, -0.25f,
            -0.346293f, -0.037983f, -0.25f,
            -0.357192f, -0.039664f, -0.25f,
            -0.368847f, -0.041462f, -0.25f,
            -0.380880f, -0.043318f, -0.25f,
            -0.392913f, -0.045174f, -0.25f,
            -0.404568f, -0.046972f, -0.25f,
            -0.415467f, -0.048653f, -0.25f,
            -0.425232f, -0.050159f, -0.25f,
    };

    short drawOrder[] = {   0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                            21, 22, 23, 24, 25, 26, 27, 28, 29, 30
                        };


    public RHCabWin(){
        this.initVertexBuff(lineCoords);
        this.initListBuff(drawOrder);
    }
}
