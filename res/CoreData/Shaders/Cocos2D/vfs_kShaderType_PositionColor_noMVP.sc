�GSN    �˅1��\7,5V'Y 6Nh &[7��H�ah�,y���(b��ʐU��0��!b�rq�s
27�/>M:pj���Rj��p���6�{�A|�4���Ӛԗ��`r�[�oM�$�g��+F��O+]��e�<�ObБ���S�/^��%��ț��s���$�����l<.W��Ы�}91��v0�/-���ēϳ$��r��8��MM>�𿞜檹Qs�.s?	zB����ϥSo����P�^=.F������"y��
j�^X�AyC�P汈��_��g�|ݳ��Cۙ��"v�[�!�i��X^c��f�G:Hd�^9�����jg�$���	�k[�Nz�A��5*:���>�G�U����&�qa�fx����MӭǙ3j���7Rx�{�x�X�������#����K��r+ M؀"Ӫ;���9���#u��c�^5n*�
�uN��zߌ�T�������)yA���ǓOXr7�oP�yIO�u� G kI,ޤ���6~trix, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
}


#endif

#ifdef FS
$input v_fragmentColor


#inc�ude "../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;Yuniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
unifo�m vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{

    gl_FragColor = v_fragmentColr;
}


#endif
