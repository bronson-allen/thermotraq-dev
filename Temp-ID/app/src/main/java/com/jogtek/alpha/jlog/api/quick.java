package com.jogtek.alpha.jlog.api;

public class quick {
	private static double[] adc22 = { 1375.219, 1370.215, 1365.283, 1360.342,
			1355.395, 1350.441, 1345.159, 1340.229, 1335.293, 1330.352,
			1325.405, 1320.453, 1315.496, 1310.534, 1305.566, 1300.593,
			1295.147, 1290.202, 1285.25, 1280.291, 1275.326, 1270.353,
			1265.375, 1260.389, 1255.397, 1250.398, 1244.953, 1239.97,
			1234.981, 1229.986, 1224.984, 1219.977, 1214.963, 1209.943,
			1204.916, 1199.884, 1194.425, 1189.41, 1184.388, 1179.361,
			1174.327, 1169.288, 1164.242, 1159.191, 1154.134, 1149.07,
			1143.654, 1138.599, 1133.54, 1128.476, 1123.407, 1118.333,
			1113.254, 1108.17, 1103.081, 1097.987, 1092.532, 1087.453, 1082.37,
			1077.282, 1072.189, 1067.09, 1061.987, 1056.879, 1051.765,
			1046.647, 1041.166, 1036.062, 1030.952, 1025.838, 1020.72,
			1015.596, 1010.467, 1005.333, 1000.194, 995.05, 989.583, 984.45,
			979.313, 974.171, 969.025, 963.875, 958.72, 953.56, 948.396,
			943.227, 937.729, 932.576, 927.418, 922.255, 917.087, 911.915,
			906.738, 901.556, 896.37, 891.178, 885.645, 880.468, 875.287,
			870.1, 864.909, 859.713, 854.513, 849.307, 844.097, 838.882,
			833.343, 828.141, 822.934, 817.723, 812.507, 807.287, 802.062,
			796.832, 791.598, 786.36, 780.807, 775.58, 770.348, 765.113,
			759.873, 754.628, 749.38, 744.127, 738.87, 733.608, 728.055,
			722.804, 717.55, 712.292, 707.029, 701.762, 696.491, 691.217,
			685.937, 680.654, 675.073, 669.803, 664.528, 659.25, 653.967,
			648.68, 643.389, 638.094, 632.794, 627.49, 621.896, 616.603,
			611.306, 606.006, 600.701, 595.392, 590.079, 584.762, 579.442,
			574.117, 568.504, 563.192, 557.877, 552.557, 547.233, 541.905,
			536.573, 531.236, 525.895, 520.551, 514.886, 509.557, 504.223,
			498.885, 493.542, 488.195, 482.843, 477.486, 472.125, 466.76,
			460.936, 455.612, 450.28, 444.941, 439.593, 434.238, 428.875,
			423.504, 418.125, 412.739, 406.483, 401.169, 395.841, 390.499,
			385.144, 379.775, 374.393, 368.997, 363.587, 358.164, 351.937,
			346.508, 341.071, 335.625, 330.172, 324.711, 319.241, 313.764,
			308.279, 302.785 };
	// ///////////////////////////////////////////////
	private static int[] index = { 0xF534, 0xF4FD, 0xF4C6, 0xF48F, 0xF458,
			0xF421, 0xF3EA, 0xF3B3, 0xF37C, 0xF345, 0xF306, 0xF2D2, 0xF29E,
			0xF26A, 0xF236, 0xF202, 0xF1CE, 0xF19A, 0xF166, 0xF132, 0xF0F7,
			0xF0C4, 0xF091, 0xF05E, 0xF02B, 0xEFF8, 0xEFC5, 0xEF92, 0xEF5F,
			0xEF2C, 0xEEF3, 0xEEB8, 0xEE7D, 0xEE42, 0xEE07, 0xEDCC, 0xED91,
			0xED56, 0xED1B, 0xECE0, 0xECA4, 0xEC70, 0xEC3C, 0xEC08, 0xEBD4,
			0xEBA0, 0xEB6C, 0xEB38, 0xEB04, 0xEAD0, 0xEA9C, 0xEA63, 0xEA2A,
			0xE9F1, 0xE9B8, 0xE97F, 0xE946, 0xE90D, 0xE8D4, 0xE89B, 0xE85C,
			0xE828, 0xE7F4, 0xE7C0, 0xE78C, 0xE758, 0xE724, 0xE6F0, 0xE6BC,
			0xE688, 0xE64B, 0xE617, 0xE5E3, 0xE5AF, 0xE57B, 0xE547, 0xE513,
			0xE4DF, 0xE4AB, 0xE477, 0xE440, 0xE40E, 0xE3DC, 0xE3AA, 0xE378,
			0xE346, 0xE314, 0xE2E2, 0xE2B0, 0xE27E, 0xE245, 0xE20C, 0xE1D3,
			0xE19A, 0xE161, 0xE128, 0xE0EF, 0xE0B6, 0xE07D, 0xE044, 0xE009,
			0xDFD1, 0xDF99, 0xDF61, 0xDF29, 0xDEF1, 0xDEB9, 0xDE81, 0xDE49,
			0xDE11, 0xDDD7, 0xDDA4, 0xDD71, 0xDD3E, 0xDD0B, 0xDCD8, 0xDCA5,
			0xDC72, 0xDC3F, 0xDC0C, 0xDBD3, 0xDB9A, 0xDB61, 0xDB28, 0xDAEF,
			0xDAB6, 0xDA7D, 0xDA44, 0xDA0B, 0xD9D2, 0xD997, 0xD962, 0xD92D,
			0xD8F8, 0xD8C3, 0xD88E, 0xD859, 0xD824, 0xD7EF, 0xD7BA, 0xD77E,
			0xD74C, 0xD71A, 0xD6E8, 0xD6B6, 0xD684, 0xD652, 0xD620, 0xD5EE,
			0xD5BC, 0xD58A, 0xD550, 0xD516, 0xD4DC, 0xD4A2, 0xD468, 0xD42E,
			0xD3F4, 0xD3BA, 0xD380, 0xD346, 0xD311, 0xD2DC, 0xD2A7, 0xD272,
			0xD23D, 0xD208, 0xD1D3, 0xD19E, 0xD169, 0xD12C, 0xD0F2, 0xD0B8,
			0xD07E, 0xD044, 0xD00A, 0xCFD0, 0xCF96, 0xCF5C, 0xCF22, 0xCEE1,
			0xCEAD, 0xCE79, 0xCE45, 0xCE11, 0xCDDD, 0xCDA9, 0xCD75, 0xCD41,
			0xCD0D, 0xCCD5, 0xCCA1, 0xCC6D, 0xCC39, 0xCC05, 0xCBD1, 0xCB9D,
			0xCB69, 0xCB35, 0xCB01, 0xCAC7, 0xCA91, 0xCA5B, 0xCA25, 0xC9EF,
			0xC9B9, 0xC983, 0xC94D, 0xC917, 0xC8E1, 0xC8A8, 0xC874, 0xC840,
			0xC80C, 0xC7D8, 0xC7A4, 0xC770, 0xC73C, 0xC708, 0xC6D4, 0xC69C,
			0xC665, 0xC62E, 0xC5F7, 0xC5C0, 0xC589, 0xC552, 0xC51B, 0xC4E4,
			0xC4AD, 0xC472, 0xC43A, 0xC402, 0xC3CA, 0xC392, 0xC35A, 0xC322,
			0xC2EA, 0xC2B2, 0xC27A, 0xC23C, 0xC207, 0xC1D2, 0xC19D, 0xC168,
			0xC133, 0xC0FE, 0xC0C9, 0xC094, 0xC05F, 0xC027, 0xBFEF, 0xBFB7,
			0xBF7F, 0xBF47, 0xBF0F, 0xBED7, 0xBE9F, 0xBE67, 0xBE2F, 0xBDF6,
			0xBDC1, 0xBD8C, 0xBD57, 0xBD22, 0xBCED, 0xBCB8, 0xBC83, 0xBC4E,
			0xBC19, 0xBBDD, 0xBBA8, 0xBB73, 0xBB3E, 0xBB09, 0xBAD4, 0xBA9F,
			0xBA6A, 0xBA35, 0xBA00, 0xB9C9, 0xB992, 0xB95B, 0xB924, 0xB8ED,
			0xB8B6, 0xB87F, 0xB848, 0xB811, 0xB7DA, 0xB79A, 0xB766, 0xB732,
			0xB6FE, 0xB6CA, 0xB696, 0xB662, 0xB62E, 0xB5FA, 0xB5C6, 0xB58A,
			0xB551, 0xB518, 0xB4DF, 0xB4A6, 0xB46D, 0xB434, 0xB3FB, 0xB3C2,
			0xB389, 0xB34C, 0xB317, 0xB2E2, 0xB2AD, 0xB278, 0xB243, 0xB20E,
			0xB1D9, 0xB1A4, 0xB16F, 0xB131, 0xB0FA, 0xB0C3, 0xB08C, 0xB055,
			0xB01E, 0xAFE7, 0xAFB0, 0xAF79, 0xAF42, 0xAF05, 0xAECE, 0xAE97,
			0xAE60, 0xAE29, 0xADF2, 0xADBB, 0xAD84, 0xAD4D, 0xAD16, 0xACDD,
			0xACA9, 0xAC75, 0xAC41, 0xAC0D, 0xABD9, 0xABA5, 0xAB71, 0xAB3D,
			0xAB09, 0xAAD3, 0xAA9C, 0xAA65, 0xAA2E, 0xA9F7, 0xA9C0, 0xA989,
			0xA952, 0xA91B, 0xA8E4, 0xA8A9, 0xA871, 0xA839, 0xA801, 0xA7C9,
			0xA791, 0xA759, 0xA721, 0xA6E9, 0xA6B1, 0xA674, 0xA63F, 0xA60A,
			0xA5D5, 0xA5A0, 0xA56B, 0xA536, 0xA501, 0xA4CC, 0xA497, 0xA45B,
			0xA423, 0xA3EB, 0xA3B3, 0xA37B, 0xA343, 0xA30B, 0xA2D3, 0xA29B,
			0xA263, 0xA22A, 0xA1F4, 0xA1BE, 0xA188, 0xA152, 0xA11C, 0xA0E6,
			0xA0B0, 0xA07A, 0xA044, 0xA00C, 0x9FD5, 0x9F9E, 0x9F67, 0x9F30,
			0x9EF9, 0x9EC2, 0x9E8B, 0x9E54, 0x9E1D, 0x9DE2, 0x9DAA, 0x9D72,
			0x9D3A, 0x9D02, 0x9CCA, 0x9C92, 0x9C5A, 0x9C22, 0x9BEA, 0x9BAF,
			0x9B7B, 0x9B47, 0x9B13, 0x9ADF, 0x9AAB, 0x9A77, 0x9A43, 0x9A0F,
			0x99DB, 0x999E, 0x9967, 0x9930, 0x98F9, 0x98C2, 0x988B, 0x9854,
			0x981D, 0x97E6, 0x97AF, 0x976F, 0x973B, 0x9707, 0x96D3, 0x969F,
			0x966B, 0x9637, 0x9603, 0x95CF, 0x959B, 0x9562, 0x9529, 0x94F0,
			0x94B7, 0x947E, 0x9445, 0x940C, 0x93D3, 0x939A, 0x9361, 0x931F,
			0x92E7, 0x92AF, 0x9277, 0x923F, 0x9207, 0x91CF, 0x9197, 0x915F,
			0x9127, 0x90E8, 0x90B4, 0x9080, 0x904C, 0x9018, 0x8FE4, 0x8FB0,
			0x8F7C, 0x8F48, 0x8F14, 0x8EDF, 0x8EA9, 0x8E73, 0x8E3D, 0x8E07,
			0x8DD1, 0x8D9B, 0x8D65, 0x8D2F, 0x8CF9, 0x8CBC, 0x8C86, 0x8C50,
			0x8C1A, 0x8BE4, 0x8BAE, 0x8B78, 0x8B42, 0x8B0C, 0x8AD6, 0x8A99,
			0x8A5E, 0x8A23, 0x89E8, 0x89AD, 0x8972, 0x8937, 0x88FC, 0x88C1,
			0x8886, 0x8842, 0x880C, 0x87D6, 0x87A0, 0x876A, 0x8734, 0x86FE,
			0x86C8, 0x8692, 0x865C, 0x8625, 0x85EE, 0x85B7, 0x8580, 0x8549,
			0x8512, 0x84DB, 0x84A4, 0x846D, 0x8436, 0x83F7, 0x83C1, 0x838B,
			0x8355, 0x831F, 0x82E9, 0x82B3, 0x827D, 0x8247, 0x8211, 0x81D8,
			0x81A2, 0x816C, 0x8136, 0x8100, 0x80CA, 0x8094, 0x805E, 0x8028,
			0x7FF2, 0x7FB8, 0x7F81, 0x7F4A, 0x7F13, 0x7EDC, 0x7EA5, 0x7E6E,
			0x7E37, 0x7E00, 0x7DC9, 0x7D92, 0x7D5B, 0x7D24, 0x7CED, 0x7CB6,
			0x7C7F, 0x7C48, 0x7C11, 0x7BDA, 0x7BA3, 0x7B68, 0x7B32, 0x7AFC,
			0x7AC6, 0x7A90, 0x7A5A, 0x7A24, 0x79EE, 0x79B8, 0x7982, 0x794A,
			0x7911, 0x78D8, 0x789F, 0x7866, 0x782D, 0x77F4, 0x77BB, 0x7782,
			0x7749, 0x7707, 0x76D0, 0x7699, 0x7662, 0x762B, 0x75F4, 0x75BD,
			0x7586, 0x754F, 0x7518, 0x74DC, 0x74A5, 0x746E, 0x7437, 0x7400,
			0x73C9, 0x7392, 0x735B, 0x7324, 0x72ED, 0x72AD, 0x7274, 0x723B,
			0x7202, 0x71C9, 0x7190, 0x7157, 0x711E, 0x70E5, 0x70AC, 0x7072,
			0x703E, 0x700A, 0x6FD6, 0x6FA2, 0x6F6E, 0x6F3A, 0x6F06, 0x6ED2,
			0x6E9E, 0x6E62, 0x6E2A, 0x6DF2, 0x6DBA, 0x6D82, 0x6D4A, 0x6D12,
			0x6CDA, 0x6CA2, 0x6C6A, 0x6C31, 0x6BF9, 0x6BC1, 0x6B89, 0x6B51,
			0x6B19, 0x6AE1, 0x6AA9, 0x6A71, 0x6A39, 0x69FE, 0x69C8, 0x6992,
			0x695C, 0x6926, 0x68F0, 0x68BA, 0x6884, 0x684E, 0x6818, 0x67E2,
			0x67A8, 0x676E, 0x6734, 0x66FA, 0x66C0, 0x6686, 0x664C, 0x6612,
			0x65D8, 0x659A, 0x6565, 0x6530, 0x64FB, 0x64C6, 0x6491, 0x645C,
			0x6427, 0x63F2, 0x63BD, 0x6384, 0x634A, 0x6310, 0x62D6, 0x629C,
			0x6262, 0x6228, 0x61EE, 0x61B4, 0x617A, 0x6138, 0x6101, 0x60CA,
			0x6093, 0x605C, 0x6025, 0x5FEE, 0x5FB7, 0x5F80, 0x5F49, 0x5F12,
			0x5EDD, 0x5EA8, 0x5E73, 0x5E3E, 0x5E09, 0x5DD4, 0x5D9F, 0x5D6A,
			0x5D35, 0x5CF9, 0x5CC1, 0x5C89, 0x5C51, 0x5C19, 0x5BE1, 0x5BA9,
			0x5B71, 0x5B39, 0x5B01, 0x5AC2, 0x5A8B, 0x5A54, 0x5A1D, 0x59E6,
			0x59AF, 0x5978, 0x5941, 0x590A, 0x58D3, 0x589B, 0x5862, 0x5829,
			0x57F0, 0x57B7, 0x577E, 0x5745, 0x570C, 0x56D3, 0x569A, 0x5660,
			0x5628, 0x55F0, 0x55B8, 0x5580, 0x5548, 0x5510, 0x54D8, 0x54A0,
			0x5468, 0x5430, 0x53F9, 0x53C2, 0x538B, 0x5354, 0x531D, 0x52E6,
			0x52AF, 0x5278, 0x5241, 0x5209, 0x51CF, 0x5195, 0x515B, 0x5121,
			0x50E7, 0x50AD, 0x5073, 0x5039, 0x4FFF, 0x4FC3, 0x4F8E, 0x4F59,
			0x4F24, 0x4EEF, 0x4EBA, 0x4E85, 0x4E50, 0x4E1B, 0x4DE6, 0x4DAC,
			0x4D73, 0x4D3A, 0x4D01, 0x4CC8, 0x4C8F, 0x4C56, 0x4C1D, 0x4BE4,
			0x4BAB, 0x4B6D, 0x4B38, 0x4B03, 0x4ACE, 0x4A99, 0x4A64, 0x4A2F,
			0x49FA, 0x49C5, 0x4990, 0x4953, 0x4914, 0x48D5, 0x4896, 0x4857,
			0x4818, 0x47D9, 0x479A, 0x475B, 0x471C, 0x46DC, 0x46A9, 0x4676,
			0x4643, 0x4610, 0x45DD, 0x45AA, 0x4577, 0x4544, 0x4511, 0x44DD,
			0x44A6, 0x446F, 0x4438, 0x4401, 0x43CA, 0x4393, 0x435C, 0x4325,
			0x42EE, 0x42B7, 0x427E, 0x4245, 0x420C, 0x41D3, 0x419A, 0x4161,
			0x4128, 0x40EF, 0x40B6, 0x4074, 0x4039, 0x3FFE, 0x3FC3, 0x3F88,
			0x3F4D, 0x3F12, 0x3ED7, 0x3E9C, 0x3E61, 0x3E1F, 0x3DE6, 0x3DAD,
			0x3D74, 0x3D3B, 0x3D02, 0x3CC9, 0x3C90, 0x3C57, 0x3C1E, 0x3BDF,
			0x3BA8, 0x3B71, 0x3B3A, 0x3B03, 0x3ACC, 0x3A95, 0x3A5E, 0x3A27,
			0x39F0, 0x39B3, 0x397B, 0x3943, 0x390B, 0x38D3, 0x389B, 0x3863,
			0x382B, 0x37F3, 0x37BB, 0x377C, 0x3743, 0x370A, 0x36D1, 0x3698,
			0x365F, 0x3626, 0x35ED, 0x35B4, 0x357B, 0x3540, 0x350C, 0x34D8,
			0x34A4, 0x3470, 0x343C, 0x3408, 0x33D4, 0x33A0, 0x336C, 0x3336,
			0x32FC, 0x32C2, 0x3288, 0x324E, 0x3214, 0x31DA, 0x31A0, 0x3166,
			0x312C, 0x30ED, 0x30B4, 0x307B, 0x3042, 0x3009, 0x2FD0, 0x2F97,
			0x2F5E, 0x2F25, 0x2EEC, 0x2EB2, 0x2E79, 0x2E40, 0x2E07, 0x2DCE,
			0x2D95, 0x2D5C, 0x2D23, 0x2CEA, 0x2CB1, 0x2C71, 0x2C38, 0x2BFF,
			0x2BC6, 0x2B8D, 0x2B54, 0x2B1B, 0x2AE2, 0x2AA9, 0x2A70, 0x2A33,
			0x29F9, 0x29BF, 0x2985, 0x294B, 0x2911, 0x28D7, 0x289D, 0x2863,
			0x2829, 0x27EF, 0x27B7, 0x277F, 0x2747, 0x270F, 0x26D7, 0x269F,
			0x2667, 0x262F, 0x25F7, 0x25BF, 0x258B, 0x2557, 0x2523, 0x24EF,
			0x24BB, 0x2487, 0x2453, 0x241F, 0x23EB, 0x23AF, 0x2375, 0x233B,
			0x2301, 0x22C7, 0x228D, 0x2253, 0x2219, 0x21DF, 0x21A5, 0x2162,
			0x212A, 0x20F2, 0x20BA, 0x2082, 0x204A, 0x2012, 0x1FDA, 0x1FA2,
			0x1F6A, 0x1F2E, 0x1EF3, 0x1EB8, 0x1E7D, 0x1E42, 0x1E07, 0x1DCC,
			0x1D91, 0x1D56, 0x1D1B, 0x1CE0, 0x1CA8, 0x1C70, 0x1C38, 0x1C00,
			0x1BC8, 0x1B90, 0x1B58, 0x1B20, 0x1AE8, 0x1AAB, 0x1A73, 0x1A3B,
			0x1A03, 0x19CB, 0x1993, 0x195B, 0x1923, 0x18EB, 0x18B3, 0x1874,
			0x1839, 0x17FE, 0x17C3, 0x1788, 0x174D, 0x1712, 0x16D7, 0x169C,
			0x1661, 0x1626, 0x15ED, 0x15B4, 0x157B, 0x1542, 0x1509, 0x14D0,
			0x1497, 0x145E, 0x1425, 0x13E9, 0x13B3, 0x137D, 0x1347, 0x1311,
			0x12DB, 0x12A5, 0x126F, 0x1239, 0x1203, 0x11CB, 0x1194, 0x115D,
			0x1126, 0x10EF, 0x10B8, 0x1081, 0x104A, 0x1013, 0xFDC, 0xF9C,
			0xF62, 0xF28, 0xEEE, 0xEB4, 0xE7A, 0xE40, 0xE06, 0xDCC, 0xD92,
			0xD57, 0xD1C, 0xCE1, 0xCA6, 0xC6B, 0xC30, 0xBF5, 0xBBA, 0xB7F,
			0xB44, 0xB09, 0xACD, 0xA91, 0xA55, 0xA19, 0x9DD, 0x9A1, 0x965,
			0x929, 0x8ED, 0x8A8, 0x875, 0x842, 0x80F, 0x7DC, 0x7A9, 0x776,
			0x743, 0x710, 0x6DD, 0x6A3, 0x667, 0x62B, 0x5EF, 0x5B3, 0x577,
			0x53B, 0x4FF, 0x4C3, 0x487, 0x44B, 0x413, 0x3DB, 0x3A3, 0x36B,
			0x333, 0x2FB, 0x2C3, 0x28B, 0x253 };
	private static double[] temp = { -81.03, -79.98, -79.02, -78.12, -77.29,
			-76.5, -75.76, -75.06, -74.39, -73.75, -73.14, -72.56, -72, -71.46,
			-70.95, -70.45, -69.96, -69.5, -69.04, -68.61, -68.18, -67.77,
			-67.36, -66.97, -66.59, -66.21, -65.85, -65.49, -65.14, -64.8,
			-64.47, -64.14, -63.83, -63.51, -63.2, -62.9, -62.61, -62.32,
			-62.03, -61.75, -61.47, -61.2, -60.93, -60.67, -60.41, -60.16,
			-59.91, -59.66, -59.41, -59.17, -58.94, -58.7, -58.47, -58.24,
			-58.02, -57.79, -57.57, -57.36, -57.14, -56.93, -56.72, -56.51,
			-56.31, -56.11, -55.91, -55.71, -55.51, -55.32, -55.13, -54.94,
			-54.75, -54.56, -54.38, -54.19, -54.01, -53.83, -53.65, -53.48,
			-53.3, -53.13, -52.96, -52.79, -52.62, -52.45, -52.29, -52.12,
			-51.96, -51.8, -51.64, -51.48, -51.32, -51.16, -51, -50.85, -50.7,
			-50.54, -50.39, -50.24, -50.09, -49.94, -49.8, -49.65, -49.51,
			-49.36, -49.22, -49.08, -48.93, -48.79, -48.65, -48.52, -48.38,
			-48.24, -48.1, -47.97, -47.83, -47.7, -47.57, -47.43, -47.3,
			-47.17, -47.04, -46.91, -46.78, -46.66, -46.53, -46.4, -46.28,
			-46.15, -46.03, -45.9, -45.78, -45.66, -45.53, -45.41, -45.29,
			-45.17, -45.05, -44.93, -44.81, -44.69, -44.58, -44.46, -44.34,
			-44.23, -44.11, -44, -43.88, -43.77, -43.66, -43.54, -43.43,
			-43.32, -43.21, -43.1, -42.99, -42.88, -42.77, -42.66, -42.55,
			-42.44, -42.33, -42.22, -42.12, -42.01, -41.9, -41.8, -41.69,
			-41.59, -41.48, -41.38, -41.27, -41.17, -41.07, -40.97, -40.86,
			-40.76, -40.66, -40.56, -40.46, -40.36, -40.26, -40.16, -40.06,
			-39.96, -39.86, -39.76, -39.66, -39.56, -39.46, -39.37, -39.27,
			-39.17, -39.08, -38.98, -38.88, -38.79, -38.69, -38.6, -38.5,
			-38.41, -38.31, -38.22, -38.13, -38.03, -37.94, -37.85, -37.75,
			-37.66, -37.57, -37.48, -37.38, -37.29, -37.2, -37.11, -37.02,
			-36.93, -36.84, -36.75, -36.66, -36.57, -36.48, -36.39, -36.3,
			-36.21, -36.13, -36.04, -35.95, -35.86, -35.77, -35.69, -35.6,
			-35.51, -35.42, -35.34, -35.25, -35.17, -35.08, -34.99, -34.91,
			-34.82, -34.74, -34.65, -34.57, -34.48, -34.4, -34.31, -34.23,
			-34.14, -34.06, -33.98, -33.89, -33.81, -33.73, -33.64, -33.56,
			-33.48, -33.4, -33.31, -33.23, -33.15, -33.07, -32.98, -32.9,
			-32.82, -32.74, -32.66, -32.58, -32.5, -32.42, -32.34, -32.25,
			-32.17, -32.09, -32.01, -31.93, -31.85, -31.77, -31.7, -31.62,
			-31.54, -31.46, -31.38, -31.3, -31.22, -31.14, -31.06, -30.98,
			-30.91, -30.83, -30.75, -30.67, -30.59, -30.52, -30.44, -30.36,
			-30.28, -30.21, -30.13, -30.05, -29.98, -29.9, -29.82, -29.75,
			-29.67, -29.59, -29.52, -29.44, -29.36, -29.29, -29.21, -29.14,
			-29.06, -28.98, -28.91, -28.83, -28.76, -28.68, -28.61, -28.53,
			-28.46, -28.38, -28.31, -28.23, -28.16, -28.08, -28.01, -27.94,
			-27.86, -27.79, -27.71, -27.64, -27.56, -27.49, -27.42, -27.34,
			-27.27, -27.2, -27.12, -27.05, -26.98, -26.9, -26.83, -26.76,
			-26.68, -26.61, -26.54, -26.46, -26.39, -26.32, -26.25, -26.17,
			-26.1, -26.03, -25.96, -25.88, -25.81, -25.74, -25.67, -25.59,
			-25.52, -25.45, -25.38, -25.31, -25.23, -25.16, -25.09, -25.02,
			-24.95, -24.88, -24.8, -24.73, -24.66, -24.59, -24.52, -24.45,
			-24.38, -24.31, -24.23, -24.16, -24.09, -24.02, -23.95, -23.88,
			-23.81, -23.74, -23.67, -23.6, -23.53, -23.46, -23.38, -23.31,
			-23.24, -23.17, -23.1, -23.03, -22.96, -22.89, -22.82, -22.75,
			-22.68, -22.61, -22.54, -22.47, -22.4, -22.33, -22.26, -22.19,
			-22.12, -22.05, -21.98, -21.91, -21.84, -21.77, -21.7, -21.63,
			-21.56, -21.49, -21.42, -21.35, -21.28, -21.21, -21.14, -21.08,
			-21.01, -20.94, -20.87, -20.8, -20.73, -20.66, -20.59, -20.52,
			-20.45, -20.38, -20.31, -20.24, -20.17, -20.1, -20.03, -19.97,
			-19.9, -19.83, -19.76, -19.69, -19.62, -19.55, -19.48, -19.41,
			-19.34, -19.27, -19.21, -19.14, -19.07, -19, -18.93, -18.86,
			-18.79, -18.72, -18.65, -18.58, -18.51, -18.45, -18.38, -18.31,
			-18.24, -18.17, -18.1, -18.03, -17.96, -17.89, -17.83, -17.76,
			-17.69, -17.62, -17.55, -17.48, -17.41, -17.34, -17.27, -17.2,
			-17.14, -17.07, -17, -16.93, -16.86, -16.79, -16.72, -16.65,
			-16.58, -16.51, -16.45, -16.38, -16.31, -16.24, -16.17, -16.1,
			-16.03, -15.96, -15.89, -15.82, -15.75, -15.69, -15.62, -15.55,
			-15.48, -15.41, -15.34, -15.27, -15.2, -15.13, -15.06, -14.99,
			-14.92, -14.85, -14.79, -14.72, -14.65, -14.58, -14.51, -14.44,
			-14.37, -14.3, -14.23, -14.16, -14.09, -14.02, -13.95, -13.88,
			-13.81, -13.74, -13.67, -13.6, -13.53, -13.46, -13.39, -13.32,
			-13.25, -13.18, -13.11, -13.04, -12.97, -12.9, -12.83, -12.76,
			-12.69, -12.62, -12.55, -12.48, -12.41, -12.34, -12.27, -12.2,
			-12.13, -12.06, -11.99, -11.92, -11.85, -11.78, -11.71, -11.64,
			-11.57, -11.5, -11.43, -11.36, -11.28, -11.21, -11.14, -11.07, -11,
			-10.93, -10.86, -10.79, -10.72, -10.64, -10.57, -10.5, -10.43,
			-10.36, -10.29, -10.22, -10.14, -10.07, -10, -9.93, -9.86, -9.79,
			-9.71, -9.64, -9.57, -9.5, -9.43, -9.35, -9.28, -9.21, -9.14,
			-9.07, -8.99, -8.92, -8.85, -8.78, -8.7, -8.63, -8.56, -8.48,
			-8.41, -8.34, -8.27, -8.19, -8.12, -8.05, -7.97, -7.9, -7.83,
			-7.75, -7.68, -7.6, -7.53, -7.46, -7.38, -7.31, -7.24, -7.16,
			-7.09, -7.01, -6.94, -6.86, -6.79, -6.72, -6.64, -6.57, -6.49,
			-6.42, -6.34, -6.27, -6.19, -6.12, -6.04, -5.97, -5.89, -5.82,
			-5.74, -5.66, -5.59, -5.51, -5.44, -5.36, -5.29, -5.21, -5.13,
			-5.06, -4.98, -4.9, -4.83, -4.75, -4.67, -4.6, -4.52, -4.44, -4.37,
			-4.29, -4.21, -4.13, -4.06, -3.98, -3.9, -3.82, -3.75, -3.67,
			-3.59, -3.51, -3.43, -3.36, -3.28, -3.2, -3.12, -3.04, -2.96,
			-2.88, -2.8, -2.72, -2.64, -2.57, -2.49, -2.41, -2.33, -2.25,
			-2.17, -2.09, -2.01, -1.93, -1.84, -1.76, -1.68, -1.6, -1.52,
			-1.44, -1.36, -1.28, -1.2, -1.11, -1.03, -0.95, -0.87, -0.79, -0.7,
			-0.62, -0.54, -0.46, -0.37, -0.29, -0.21, -0.13, -0.04, 0.03, 0.12,
			0.2, 0.28, 0.37, 0.45, 0.54, 0.62, 0.7, 0.79, 0.87, 0.96, 1.04,
			1.13, 1.22, 1.3, 1.39, 1.47, 1.56, 1.65, 1.73, 1.82, 1.91, 1.99,
			2.08, 2.17, 2.25, 2.34, 2.43, 2.52, 2.61, 2.69, 2.78, 2.87, 2.96,
			3.05, 3.14, 3.23, 3.32, 3.41, 3.5, 3.59, 3.68, 3.77, 3.86, 3.95,
			4.04, 4.13, 4.22, 4.32, 4.41, 4.5, 4.59, 4.68, 4.78, 4.87, 4.96,
			5.06, 5.15, 5.24, 5.34, 5.43, 5.52, 5.62, 5.71, 5.81, 5.9, 6, 6.1,
			6.19, 6.29, 6.38, 6.48, 6.58, 6.67, 6.77, 6.87, 6.97, 7.06, 7.16,
			7.26, 7.36, 7.46, 7.56, 7.66, 7.76, 7.86, 7.96, 8.06, 8.16, 8.26,
			8.36, 8.46, 8.56, 8.67, 8.77, 8.87, 8.97, 9.08, 9.18, 9.28, 9.39,
			9.49, 9.6, 9.7, 9.81, 9.91, 10.02, 10.13, 10.23, 10.34, 10.45,
			10.55, 10.66, 10.77, 10.88, 10.99, 11.09, 11.2, 11.31, 11.42,
			11.53, 11.64, 11.76, 11.87, 11.98, 12.09, 12.2, 12.32, 12.43,
			12.54, 12.66, 12.77, 12.88, 13, 13.11, 13.23, 13.35, 13.46, 13.58,
			13.7, 13.81, 13.93, 14.05, 14.17, 14.29, 14.41, 14.53, 14.65,
			14.77, 14.89, 15.01, 15.14, 15.26, 15.38, 15.51, 15.63, 15.75,
			15.88, 16, 16.13, 16.26, 16.38, 16.51, 16.64, 16.77, 16.9, 17.03,
			17.16, 17.29, 17.42, 17.55, 17.68, 17.81, 17.95, 18.08, 18.21,
			18.35, 18.48, 18.62, 18.76, 18.89, 19.03, 19.17, 19.31, 19.45,
			19.59, 19.73, 19.87, 20.01, 20.15, 20.29, 20.44, 20.58, 20.73,
			20.87, 21.02, 21.17, 21.31, 21.46, 21.61, 21.76, 21.91, 22.06,
			22.21, 22.37, 22.52, 22.67, 22.83, 22.99, 23.14, 23.3, 23.46,
			23.62, 23.78, 23.94, 24.1, 24.26, 24.42, 24.59, 24.75, 24.92,
			25.08, 25.25, 25.42, 25.59, 25.76, 25.93, 26.1, 26.28, 26.45,
			26.63, 26.8, 26.98, 27.16, 27.34, 27.52, 27.7, 27.88, 28.06, 28.25,
			28.44, 28.62, 28.81, 29, 29.19, 29.38, 29.58, 29.77, 29.97, 30.16,
			30.36, 30.56, 30.76, 30.96, 31.17, 31.37, 31.58, 31.79, 32, 32.21,
			32.42, 32.63, 32.85, 33.06, 33.28, 33.5, 33.73, 33.95, 34.17, 34.4,
			34.63, 34.86, 35.09, 35.33, 35.56, 35.8, 36.04, 36.28, 36.53,
			36.77, 37.02, 37.27, 37.52, 37.78, 38.03, 38.29, 38.55, 38.82,
			39.08, 39.35, 39.62, 39.9, 40.17, 40.45, 40.73, 41.02, 41.3, 41.59,
			41.88, 42.18, 42.48, 42.78, 43.09, 43.39, 43.7, 44.02, 44.34,
			44.66, 44.98, 45.31, 45.64, 45.98, 46.32, 46.67, 47.01, 47.37,
			47.72, 48.08, 48.45, 48.82, 49.2, 49.58, 49.96, 50.35, 50.75,
			51.15, 51.55, 51.97, 52.38, 52.81, 53.24, 53.67, 54.12, 54.57,
			55.02, 55.49, 55.96, 56.44, 56.92, 57.42, 57.92, 58.43, 58.95,
			59.48, 60.02, 60.57, 61.13, 61.7, 62.28, 62.88, 63.48, 64.1, 64.73,
			65.37, 66.03, 66.7, 67.39, 68.09, 68.81, 69.55, 70.3, 71.07, 71.87,
			72.68, 73.52, 74.38, 75.26, 76.17, 77.11, 78.07, 79.07, 80.09,
			81.16, 82.25, 83.39, 84.57, 85.79, 87.06, 88.39, 89.76, 91.2, 92.7,
			94.28, 95.93, 97.66, 99.49, 101.42, 103.47, 105.64, 107.95, 110.43,
			113.09, 115.95, 119.06, 122.46, 126.19, 130.32, 134.94, 140.16,
			146.16, 153.17, 161.55, 171.88, 185.21, 203.59, 232.13, 289.67 };
	private static int[] index2 = { 0x021B, 0x044B, 0x06A3, 0x08A8, 0x0B09,
			0x0D57, 0x0F9C, 0x11CB, 0x13E9, 0x1626, 0x1874, 0x1AAB, 0x1CE0,
			0x1F2E, 0x2162, 0x23AF, 0x25BF, 0x27EF, 0x2A33, 0x2C71, 0x2EB2,
			0x30ED, 0x3336, 0x3540, 0x377C, 0x39B3, 0x3BDF, 0x3E1F, 0x4074,
			0x42B7, 0x44DD, 0x46DC, 0x4953, 0x4B6D, 0x4DAC, 0x4FC3, 0x5209,
			0x5430, 0x5660, 0x589B, 0x5AC2, 0x5CF9, 0x5F12, 0x6138, 0x6384,
			0x659A, 0x67E2, 0x69FE, 0x6C31, 0x6E62, 0x7072, 0x72AD, 0x74DC,
			0x7707, 0x794A, 0x7B68, 0x7D92, 0x7FB8, 0x81D8, 0x83F7, 0x8625,
			0x8842, 0x8A99, 0x8CBC, 0x8EDF, 0x90E8, 0x931F, 0x9562, 0x976F,
			0x999E, 0x9BAF, 0x9DE2, 0xA00C, 0xA22A, 0xA45B, 0xA674, 0xA8A9,
			0xAAD3, 0xACDD, 0xAF05, 0xB131, 0xB34C, 0xB58A, 0xB79A, 0xB9C9,
			0xBBDD, 0xBDF6, 0xC027, 0xC23C, 0xC472, 0xC69C, 0xC8A8, 0xCAC7,
			0xCCD5, 0xCEE1, 0xD12C, 0xD346, 0xD58A, 0xD77E, 0xD997, 0xDBD3,
			0xDDD7, 0xE009, 0xE245, 0xE440, 0xE64B, 0xE85C, 0xEA9C, 0xECA4,
			0xEEF3, 0xF0F7, 0xF306, 0xF534, 0xF755, 0xF951, 0xFB7A, 0xFDA4,
			0xFF41, 0xFFFF };
	private static double[] temp2 = { 0, 0.01, 0.02, 0.03, 0.04, 0.05, 0.06,
			0.07, 0.08, 0.09, 0.1, 0.11, 0.12, 0.13, 0.14, 0.15, 0.16, 0.17,
			0.18, 0.19, 0.2, 0.21, 0.22, 0.23, 0.24, 0.25, 0.26, 0.27, 0.28,
			0.29, 0.3, 0.31, 0.32, 0.33, 0.34, 0.35, 0.36, 0.37, 0.38, 0.39,
			0.4, 0.41, 0.42, 0.43, 0.44, 0.45, 0.46, 0.47, 0.48, 0.49, 0.5,
			0.51, 0.52, 0.53, 0.54, 0.55, 0.56, 0.57, 0.58, 0.59, 0.6, 0.61,
			0.62, 0.63, 0.64, 0.65, 0.66, 0.67, 0.68, 0.69, 0.7, 0.71, 0.72,
			0.73, 0.74, 0.75, 0.76, 0.77, 0.78, 0.79, 0.8, 0.81, 0.82, 0.83,
			0.84, 0.85, 0.86, 0.87, 0.88, 0.89, 0.9, 0.91, 0.92, 0.93, 0.94,
			0.95, 0.96, 0.97, 0.98, 0.99, 1, 1.01, 1.02, 1.03, 1.04, 1.05,
			1.06, 1.07, 1.08, 1.09, 1.1, 1.11, 1.12, 1.13, 1.14, 1.15, 1.16,
			1.17, 1.18 };
	private static int[] ADC = { 0xF534, 0xF306, 0xF0F7, 0xEEF3, 0xECA4,
			0xEA9C, 0xE85C, 0xE64B, 0xE440, 0xE245, 0xE009, 0xDDD7, 0xDBD3,
			0xD997, 0xD77E, 0xD58A, 0xD346, 0xD12C, 0xCEE1, 0xCCD5, 0xCAC7,
			0xC8A8, 0xC69C, 0xC472, 0xC23C, 0xC027, 0xBDF6, 0xBBDD, 0xB9C9,
			0xB79A, 0xB58A, 0xB34C, 0xB131, 0xAF05, 0xACDD, 0xAAD3, 0xA8A9,
			0xA674, 0xA45B, 0xA22A, 0xA00C, 0x9DE2, 0x9BAF, 0x999E, 0x976F,
			0x9562, 0x931F, 0x90E8, 0x8EDF, 0x8CBC, 0x8A99, 0x8842, 0x8625,
			0x83F7, 0x81D8, 0x7FB8, 0x7D92, 0x7B68, 0x794A, 0x7707, 0x74DC,
			0x72AD, 0x7072, 0x6E62, 0x6C31, 0x69FE, 0x67E2, 0x659A, 0x6384,
			0x6138, 0x5F12, 0x5CF9, 0x5AC2, 0x589B, 0x5660, 0x5430, 0x5209,
			0x4FC3, 0x4DAC, 0x4B6D, 0x4953, 0x46DC, 0x44DD, 0x42B7, 0x4074,
			0x3E1F, 0x3BDF, 0x39B3, 0x377C, 0x3540, 0x3336, 0x30ED, 0x2EB2,
			0x2C71, 0x2A33, 0x27EF, 0x25BF, 0x23AF, 0x2162, 0x1F2E, 0x1CE0,
			0x1AAB, 0x1874, 0x1626, 0x13E9, 0x11CB, 0x0F9C, 0x0D57, 0x0B09,
			0x08A8, 0x06A3, 0x044B, 0x021B };
	private static int[] temp33 = { -81, -80, -79, -78, -77, -76, -75, -74,
			-73, -72, -71, -70, -69, -68, -67, -66, -65, -64, -63, -62, -61,
			-60, -59, -58, -57, -56, -55, -54, -53, -52, -51, -50, -49, -48,
			-47, -46, -45, -44, -43, -42, -41, -40, -39, -38, -37, -36, -35,
			-34, -33, -32, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22,
			-21, -20, -19, -18, -17, -16, -15, -14, -13, -12, -11, -10, -9, -8,
			-7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
			12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28,
			29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
			46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62,
			63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
			80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96,
			97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110,
			111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123,
			124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136,
			137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149,
			150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162,
			163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175,
			176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188,
			189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201,
			202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214,
			215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227,
			228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240,
			241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253,
			254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 265, 266, 267,
			268, 269, 271, 272, 273, 274, 276, 277, 278, 280, 281, 283, 284,
			286, 288, 289, 291, 293, 294, 296, 298, 300, 302, 304, 306, 308,
			310, 312, 315, 317, 320, 322, 325, 327, 330, 333, 336, 339, 343,
			346, 350, 353, 357, 361, 366, 370, 375, 380, 385, 391, 397, 404,
			411, 418, 426, 435, 444, 455, 467, 480, 494, 511, 530, 553, 581,
			615, 659, 719, 809, 968, 1383 };
	private static int[] up = { 62772, 62762, 62709, 62652, 62590, 62523,
			62451, 62374, 62290, 62193, 62102, 62003, 61898, 61785, 61658,
			61531, 61395, 61250, 61083, 60893, 60690, 60487, 60286, 60073,
			59820, 59558, 59290, 59023, 58739, 58443, 58136, 57805, 57429,
			57038, 56641, 56252, 55802, 55353, 54914, 54438, 53911, 53383,
			52821, 52283, 51724, 51141, 50538, 49893, 49255, 48576, 47919,
			47229, 46538, 45792, 45069, 44322, 43592, 42817, 42053, 41267,
			40484, 39682, 38900, 38116, 37289, 36512, 35722, 34883, 34092,
			33309, 32534, 31752, 30978, 30192, 29429, 28661, 27941, 27200,
			26485, 25763, 25054, 24367, 23045, 22395, 21754, 21138, 20514,
			19939, 19349, 18804, 18190, 17691, 17184, 16662, 16141, 15639,
			15164, 14712, 14273, 13839, 13435, 13052, 12650, 12264, 11886,
			11527, 11175, 10838, 10507, 10188, 9888, 9595, 9334, 9068, 8796,
			8530, 8285, 8048, 7810, 7577, 7349, 7142, 6943, 6743, 6556, 6376,
			6198, 6021, 5850, 5684, 5526, 5376, 5232, 5091, 4963, 4839, 4720,
			4604, 4482, 4372, 4266, 4163, 4064, 3965, 3867, 3772, 3680, 3591,
			3505, 3422, 3340, 3261, 3184, 3110, 3038, 2968, 2901, 2836, 2762,
			2700, 2640, 2581, 2524, 2469, 2416, 2364, 2314, 2266, 2219, 2172,
			2135, 2098, 2063, 2028, 1995, 1962, 1931, 1900, 1871, 1842, 1814,
			1787, 1761, 1735, 1710, 1684, 1656, 1629, 1603, 1577, 1553, 1529,
			1505, 1483, 1460, 1439, 1418, 1398, 1378, 1359, 1340, 1322, 1304,
			1286, 1270, 1253, 1237, 1221, 1206, 1191, 1177, 1163, 1149, 1136,
			1123, 1110, 1098, 1087, 1076, 1065, 1054, 1044, 1034, 1025, 1015,
			1006, 997, 988, 979, 971, 963, 955, 947, 939, 932, 924, 917, 910,
			904, 897, 890, 884, 878, 872, 866, 860, 854, 849, 843, 838, 833,
			828, 823, 818, 813, 809, 804, 800, 795, 791, 787, 783, 779, 775,
			771, 767, 763, 760, 756, 753, 749, 746, 743, 739, 736, 733, 730,
			727, 724, 721, 719, 716, 713, 711, 708, 705, 703, 701, 698, 696,
			694, 691, 689, 687, 685, 683, 681, 679, 677, 675, 673, 671, 669,
			667, 665, 664, 662, 660, 659, 657, 655, 654, 652, 651, 649, 648,
			646, 645, 643, 642, 641, 639, 638, 637, 636, 634, 633, 632, 631,
			630, 628, 627, 626, 625, 624, 623, 622, 621, 620, 619, 618, 617,
			616, 615, 614, 613, 612, 611, 610, 609, 608, 607, 606, 605, 604,
			603, 602, 601, 600, 599, 598, 597, 596, 595, 594, 593, 592, 591,
			590, 589, 588, 587, 586, 585, 584, 583, 582, 581, 580, 579, 578,
			577, 576, 575, 574, 573, 572, 571, 570, 569, 568, 567, 566, 565,
			564, 563, 562, 561, 560, 559, 558, 557, 556, 555, 554, 553, 552,
			551, 550, 549, 548, 547, 546, 545, 544, 543, 542, 541, 540 };

	public static double Search2(int A1) {
		double Vntc = 0, Rntc = 0, T = 0;
		int B = 3435;
		for (int i = 118; i >= 0; i--) {
			if (A1 >= index2[i]) {
				Vntc = temp2[i];
				Rntc = (49.9 * Vntc) / (1.13 - Vntc);
				T = (B / (Math.log(Rntc / 10) + B * (1 / 298.15))) - 273.5;
			}
		}
		return T;
	}

	/*
	 * public static int[] init2() { int[] updown = new int[500]; int[] temp2 =
	 * new int[500]; int j = 1; double dd = (int) temp[0]; temp2[0] = (int)
	 * temp[0]; updown[0] = index[0]; for (int i = 1; i < index.length; i++) {
	 * if (((dd < 0) && ((double) (temp[i] - dd) > 0)) || (dd >= 0) && ((double)
	 * (temp[i] - dd) >= 1.0)) { dd = (int) temp[i]; temp2[j] = (int) dd;
	 * updown[j++] = index[i]; } } return updown; }
	 * 
	 * public static int[] init() { int[] updown = new int[500]; int[] temp =
	 * new int[500]; int j = 0; double dd = 0; for (int i = 0xF534; i >= 0x021B;
	 * i--) { double d = Search(i); if (j == 0 || ((dd < 0) && ((double) (d -
	 * dd) > 0)) || ((dd >= 0) && ((double) (d - dd) >= 1.0))) { dd = (int) d;
	 * temp[j] = (int) dd; updown[j++] = i; } } return updown; }
	 */

	public static double Search0(int number) {
		double ret = 0;
		ret = QuickSearch(0, 0, 1120, number);
		return ret;
	}

	public static double QuickSearch(int oldpos, int left, int right, int number) {
		double ret = 0;
		int pos = 0;
		if (left < right) {
			pos = (left + right) / 2;
			if (index[pos] < number) {
				if (pos > 0 && index[pos - 1] > number)
					ret = temp[pos];
				else if (pos > 1)
					ret = QuickSearch(pos, left, pos - 1, number);
				else
					ret = temp[0];
			} else if (index[pos] > number) {
				if (pos < 1119 && index[pos + 1] < number)
					ret = temp[pos + 1];
				else if (pos < 1119)
					ret = QuickSearch(pos, pos + 1, right, number);
				else
					ret = temp[1119];
			} else {
				ret = temp[pos];
			}
		} else {
			if (oldpos > 1)
				oldpos--;
			ret = temp[oldpos];
		}
		return ret;
	}

	/*
	 * NumberFormat nf = NumberFormat.getInstance();
	 * nf.setMaximumFractionDigits( 2 ); //�p�ƫ��� String P=nf.format(T);
	 */
	public static double Search(int A1, int formula) {
		double T = 0;
		if (formula == 0) {
			double Rntc = 0, Vntc = 1130;
			double B = 3435;

			for (int v = 0; v < 113; v++) {
				Vntc = Vntc - 10;
				if (A1 >= ADC[v]) {
					double Ntmp = 0, Ntmp2 = 0, Ntmp3 = 0;
					if (v != 0) {
						Ntmp = (ADC[v - 1] - ADC[v]) / 10;
						Ntmp2 = A1 - ADC[v];
						if (Ntmp2 > 0) {
							Ntmp3 = Ntmp2 / Ntmp;
							Vntc = Vntc + Ntmp3;
						}
					}
					break;
				}
			}

			Vntc = Vntc / 1000;

			Rntc = (49.9 * Vntc) / (1.13 - Vntc);
			T = (B / (Math.log(Rntc / 10) + B * (1 / 298.15))) - 273.5;

			return T;
		} else if (formula == 1) {
			double DA = (double) A1 / 1023 * 1500;
			for (int v = 0; v < adc22.length; v++) {
				if (DA >= adc22[v]) {
					double Ntmp = 0, Ntmp2 = 0, Ntmp3 = 0;
					if (v != 0) {
						Ntmp = (double)(adc22[v - 1] - adc22[v])/100;
						Ntmp2 = DA - (double)adc22[v];
						if (Ntmp2 > 0) {
							Ntmp3 = Ntmp2 / Ntmp;
							T = v - 55 - Ntmp3/100;
						}else{
							T = v - 56;
						}
					}else{
						T = - 56;
					}
					break;
				}
			}
			return T;
		} else {//if (formula == 2) {
			double DA = (double) A1 / 4096 * 2000;
			for (int v = 0; v < adc22.length; v++) {
				if (DA >= adc22[v]) {
					double Ntmp = 0, Ntmp2 = 0, Ntmp3 = 0;
					if (v != 0) {
						Ntmp = (double)(adc22[v - 1] - adc22[v])/100;
						Ntmp2 = DA - (double)adc22[v];
						if (Ntmp2 > 0) {
							Ntmp3 = Ntmp2 / Ntmp;
							T = v - 55 - Ntmp3/100;
						}else{
							T = v - 56;
						}
					}else{
						T = - 56;
					}
					break;
				}
			}
			return T;
		}
	}

	public static int findLimit(int temp) {
		int ret = 0;
		for (int i = 0; i < temp33.length; i++) {
			if (temp <= temp33[i]) {
				ret = up[i];
				i = temp33.length;
			}
		}

		return ret;
	}
}
