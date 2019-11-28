package com.murali.nlevel;

public class Constants {


    public static String OldJsonStringList = "[{\"title\":\"Root 1\",\"children\":[{\"title\":\"Child 11\",\"children\":[{\"title\":\"Extended Child 111\",\"children\":[{\"title\":\"Super Extended Child 1111\",\"children\":[]}]},{\"title\":\"Extended Child 112\",\"children\":[]},{\"title\":\"Extended Child 113\",\"children\":[]}]},{\"title\":\"Child 12\",\"children\":[{\"title\":\"Extended Child 121\",\"children\":[]},{\"title\":\"Extended Child 122\",\"children\":[]}]},{\"title\":\"Child 13\",\"children\":[]}]},{\"title\":\"Root 2\",\"children\":[{\"title\":\"Child 21\",\"children\":[{\"title\":\"Extended Child 211\",\"children\":[]},{\"title\":\"Extended Child 212\",\"children\":[]},{\"title\":\"Extended Child 213\",\"children\":[]}]},{\"title\":\"Child 22\",\"children\":[{\"title\":\"Extended Child 221\",\"children\":[]},{\"title\":\"Extended Child 222\",\"children\":[]}]},{\"title\":\"Child 23\",\"children\":[]}]},{\"title\":\"Root 1\",\"children\":[]}]";

    public static String newJsonStringList = "{\n" +
            "\t\"products\": {\n" +
            "\t\t\"redirectUrl\": {},\n" +
            "\t\t\"query\": \"lipstick\",\n" +
            "\t\t\"paging\": {\n" +
            "\t\t\t\"index\": 1,\n" +
            "\t\t\t\"size\": 96,\n" +
            "\t\t\t\"total\": 360\n" +
            "\t\t},\n" +
            "\t\t\"hits\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"pricing\": {\n" +
            "\t\t\t\t\t\"current\": {\n" +
            "\t\t\t\t\t\t\"currency\": \"GBP\",\n" +
            "\t\t\t\t\t\t\"value\": 14,\n" +
            "\t\t\t\t\t\t\"text\": \"string\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t\"regular\": {\n" +
            "\t\t\t\t\t\t\"currency\": \"GBP\",\n" +
            "\t\t\t\t\t\t\"value\": 14,\n" +
            "\t\t\t\t\t\t\"text\": \"string\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t\"perUnit\": \"£17.50 per 10ML\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"brand\": \"Fenty\",\n" +
            "\t\t\t\t\"attributes\": {\n" +
            "\t\t\t\t\t\"product_type\": \"lipstick\",\n" +
            "\t\t\t\t\t\"color\": \"Coral\",\n" +
            "\t\t\t\t\t\"parentCategory_UK\": \"33137\",\n" +
            "\t\t\t\t\t\"format\": \"stick\",\n" +
            "\t\t\t\t\t\"key_features\": \"moisturising\",\n" +
            "\t\t\t\t\t\"ProductReviewFlag\": \"1\",\n" +
            "\t\t\t\t\t\"Colour\": \"Coral\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"variants\": {\n" +
            "\t\t\t\t\t\"colours\": [\n" +
            "\t\t\t\t\t\t\"Purple#662483\",\n" +
            "\t\t\t\t\t\t\"Black#000000\",\n" +
            "\t\t\t\t\t\t\"Bronze#965A38\",\n" +
            "\t\t\t\t\t\t\"Green#009640\",\n" +
            "\t\t\t\t\t\t\"Red#FF0000\",\n" +
            "\t\t\t\t\t\t\"Nude#FFCC9D\",\n" +
            "\t\t\t\t\t\t\"Orange#EA5B0C\",\n" +
            "\t\t\t\t\t\t\"Pink#EC69A4\"\n" +
            "\t\t\t\t\t]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"categories\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"make-up\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"lips\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"all lips\",\n" +
            "\t\t\t\t\t\t\t\"lipsticks\",\n" +
            "\t\t\t\t\t\t\t\"all lip\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > all lips\",\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > lipsticks\",\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > all lip\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t],\n" +
            "\t\t\t\t\"reviews\": {\n" +
            "\t\t\t\t\t\"rounded\": 5,\n" +
            "\t\t\t\t\t\"count\": 6,\n" +
            "\t\t\t\t\t\"average\": 5\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"parent\": {\n" +
            "\t\t\t\t\t\"product\": \"947757\",\n" +
            "\t\t\t\t\t\"partNumber\": \"10263147\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"images\": {\n" +
            "\t\t\t\t\t\"thumbnailImage\": \"https://boots.scene7.com/is/image/Boots/10263147?wid=45&hei=60&op_sharpen=1\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"offers\": [],\n" +
            "\t\t\t\t\"iconUri\": \"https://boots.scene7.com/is/image/Boots/10089053?op_sharpen=1\",\n" +
            "\t\t\t\t\"title\": \"Florence By Mills Glow Yeah Lip Oil\",\n" +
            "\t\t\t\t\"referenceUri\": \"/fenty-beauty-gloss-bomb-universal-lip-luminizer-10263147\",\n" +
            "\t\t\t\t\"highlight\": \"true\",\n" +
            "\t\t\t\t\"objectId\": \"10263147001\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"pricing\": {\n" +
            "\t\t\t\t\t\"perUnit\": \"\",\n" +
            "\t\t\t\t\t\"current\": {\n" +
            "\t\t\t\t\t\t\"currency\": \"GBP\",\n" +
            "\t\t\t\t\t\t\"value\": 1.99,\n" +
            "\t\t\t\t\t\t\"text\": \"string\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t\"regular\": {\n" +
            "\t\t\t\t\t\t\"currency\": \"GBP\",\n" +
            "\t\t\t\t\t\t\"value\": 1.0,\n" +
            "\t\t\t\t\t\t\"text\": \"string\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"brand\": \"Barry M\",\n" +
            "\t\t\t\t\"attributes\": {\n" +
            "\t\t\t\t\t\"product_type\": \"lipstick\",\n" +
            "\t\t\t\t\t\"color\": \"Shocking Pink\",\n" +
            "\t\t\t\t\t\"parentCategory_UK\": \"33137\",\n" +
            "\t\t\t\t\t\"format\": \"stick\",\n" +
            "\t\t\t\t\t\"key_features\": \"moisturising\",\n" +
            "\t\t\t\t\t\"ProductReviewFlag\": \"1\",\n" +
            "\t\t\t\t\t\"Colour\": \"Shocking Pink\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"variants\": {\n" +
            "\t\t\t\t\t\"colours\": [\n" +
            "\t\t\t\t\t\t\"Purple#662483\",\n" +
            "\t\t\t\t\t\t\"Black#000000\",\n" +
            "\t\t\t\t\t\t\"Bronze#965A38\",\n" +
            "\t\t\t\t\t\t\"Green#009640\",\n" +
            "\t\t\t\t\t\t\"Red#FF0000\",\n" +
            "\t\t\t\t\t\t\"Nude#FFCC9D\",\n" +
            "\t\t\t\t\t\t\"Orange#EA5B0C\",\n" +
            "\t\t\t\t\t\t\"Pink#EC69A4\"\n" +
            "\t\t\t\t\t]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"categories\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"make-up\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"lips\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"all lips\",\n" +
            "\t\t\t\t\t\t\t\"lipsticks\",\n" +
            "\t\t\t\t\t\t\t\"all lip\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > all lips\",\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > lipsticks\",\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > all lip\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t],\n" +
            "\t\t\t\t\"reviews\": {\n" +
            "\t\t\t\t\t\"rounded\": 3,\n" +
            "\t\t\t\t\t\"count\": 756,\n" +
            "\t\t\t\t\t\"average\": 3.93\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"parent\": {\n" +
            "\t\t\t\t\t\"product\": \"947757\",\n" +
            "\t\t\t\t\t\"partNumber\": \"10270309\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"images\": {\n" +
            "\t\t\t\t\t\"thumbnail\": \"https://boots.scene7.com/is/image/Boots/10270309?wid=45&hei=60&op_sharpen=1\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"offers\": [\n" +
            "\t\t\t\t\t\"3 for 2 on selected Travel minis - cheapest free\"\n" +
            "\t\t\t\t],\n" +
            "\t\t\t\t\"iconUri\": \"https://boots.scene7.com/is/image/Boots/10270309?wid=45&hei=60&op_sharpen=1\",\n" +
            "\t\t\t\t\"title\": \"NIVEA Lip Balm, Original Care, 4.8g\",\n" +
            "\t\t\t\t\"referenceUri\": \"/florence-by-mills-glow-yeah-lip-oil-10270309\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"pricing\": {\n" +
            "\t\t\t\t\t\"perUnit\": \"\",\n" +
            "\t\t\t\t\t\"current\": {\n" +
            "\t\t\t\t\t\t\"currency\": \"GBP\",\n" +
            "\t\t\t\t\t\t\"value\": 2.5,\n" +
            "\t\t\t\t\t\t\"text\": \"string\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t\"regular\": {\n" +
            "\t\t\t\t\t\t\"currency\": \"GBP\",\n" +
            "\t\t\t\t\t\t\"value\": 5,\n" +
            "\t\t\t\t\t\t\"text\": \"string\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"brand\": \"Barry M\",\n" +
            "\t\t\t\t\"attributes\": {\n" +
            "\t\t\t\t\t\"product_type\": \"lipstick\",\n" +
            "\t\t\t\t\t\"color\": \"Vibrant Pink\",\n" +
            "\t\t\t\t\t\"parentCategory_UK\": \"33137\",\n" +
            "\t\t\t\t\t\"format\": \"stick\",\n" +
            "\t\t\t\t\t\"key_features\": \"moisturising\",\n" +
            "\t\t\t\t\t\"ProductReviewFlag\": \"1\",\n" +
            "\t\t\t\t\t\"Colour\": \"Vibrant Pink\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"variants\": {\n" +
            "\t\t\t\t\t\"colours\": [\n" +
            "\t\t\t\t\t\t\"Purple#662483\",\n" +
            "\t\t\t\t\t\t\"Black#000000\",\n" +
            "\t\t\t\t\t\t\"Bronze#965A38\",\n" +
            "\t\t\t\t\t\t\"Green#009640\",\n" +
            "\t\t\t\t\t\t\"Red#FF0000\",\n" +
            "\t\t\t\t\t\t\"Nude#FFCC9D\",\n" +
            "\t\t\t\t\t\t\"Orange#EA5B0C\",\n" +
            "\t\t\t\t\t\t\"Pink#EC69A4\"\n" +
            "\t\t\t\t\t]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"categories\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"make-up\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"lips\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"all lips\",\n" +
            "\t\t\t\t\t\t\t\"lipsticks\",\n" +
            "\t\t\t\t\t\t\t\"all lip\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > all lips\",\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > lipsticks\",\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > all lip\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t],\n" +
            "\t\t\t\t\"reviews\": {\n" +
            "\t\t\t\t\t\"rounded\": 4,\n" +
            "\t\t\t\t\t\"count\": 15,\n" +
            "\t\t\t\t\t\"average\": 2\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"parent\": {\n" +
            "\t\t\t\t\t\"product\": \"947757\",\n" +
            "\t\t\t\t\t\"partNumber\": \"10089053\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"images\": {\n" +
            "\t\t\t\t\t\"thumbnail\": \"https://boots.scene7.com/is/image/Boots/10089053?wid=45&hei=60&op_sharpen=1\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"offers\": [],\n" +
            "\t\t\t\t\"iconUri\": \"https://boots.scene7.com/is/image/Boots/10089053?op_sharpen=1\",\n" +
            "\t\t\t\t\"title\": \"CYO Colour Nutrition Moisturising Lipstick\",\n" +
            "\t\t\t\t\"referenceUri\": \"/barry-m-lip-paint-10089053\"\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"pricing\": {\n" +
            "\t\t\t\t\t\"perUnit\": \"\",\n" +
            "\t\t\t\t\t\"current\": {\n" +
            "\t\t\t\t\t\t\"currency\": \"GBP\",\n" +
            "\t\t\t\t\t\t\"value\": 1.99,\n" +
            "\t\t\t\t\t\t\"text\": \"string\"\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t\"regular\": {\n" +
            "\t\t\t\t\t\t\"currency\": \"GBP\",\n" +
            "\t\t\t\t\t\t\"value\": 1.0,\n" +
            "\t\t\t\t\t\t\"text\": \"string\"\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"brand\": \"Barry M\",\n" +
            "\t\t\t\t\"attributes\": {\n" +
            "\t\t\t\t\t\"product_type\": \"lipstick\",\n" +
            "\t\t\t\t\t\"color\": \"Vibrant Pink\",\n" +
            "\t\t\t\t\t\"parentCategory_UK\": \"33137\",\n" +
            "\t\t\t\t\t\"format\": \"stick\",\n" +
            "\t\t\t\t\t\"key_features\": \"moisturising\",\n" +
            "\t\t\t\t\t\"ProductReviewFlag\": \"1\",\n" +
            "\t\t\t\t\t\"Colour\": \"Vibrant Pink\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"variants\": {\n" +
            "\t\t\t\t\t\"colours\": [\n" +
            "\t\t\t\t\t\t\"Purple#662483\",\n" +
            "\t\t\t\t\t\t\"Black#000000\",\n" +
            "\t\t\t\t\t\t\"Bronze#965A38\",\n" +
            "\t\t\t\t\t\t\"Green#009640\",\n" +
            "\t\t\t\t\t\t\"Red#FF0000\",\n" +
            "\t\t\t\t\t\t\"Nude#FFCC9D\",\n" +
            "\t\t\t\t\t\t\"Orange#EA5B0C\",\n" +
            "\t\t\t\t\t\t\"Pink#EC69A4\"\n" +
            "\t\t\t\t\t]\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"categories\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"make-up\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"lips\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"name\": [\n" +
            "\t\t\t\t\t\t\t\"all lips\",\n" +
            "\t\t\t\t\t\t\t\"lipsticks\",\n" +
            "\t\t\t\t\t\t\t\"all lip\"\n" +
            "\t\t\t\t\t\t],\n" +
            "\t\t\t\t\t\t\"label\": [\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > all lips\",\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > lipsticks\",\n" +
            "\t\t\t\t\t\t\t\"beauty & skincare > make-up > lips > all lip\"\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t],\n" +
            "\t\t\t\t\"reviews\": {\n" +
            "\t\t\t\t\t\"rounded\": 3,\n" +
            "\t\t\t\t\t\"count\": 765,\n" +
            "\t\t\t\t\t\"average\": 3.93\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"parent\": {\n" +
            "\t\t\t\t\t\"product\": \"947757\",\n" +
            "\t\t\t\t\t\"partNumber\": \"10089053\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"images\": {\n" +
            "\t\t\t\t\t\"thumbnail\": \"https://boots.scene7.com/is/image/Boots/10089053?wid=45&hei=60&op_sharpen=1\"\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\t\"offers\": [],\n" +
            "\t\t\t\t\"iconUri\": \"https://boots.scene7.com/is/image/Boots/10089053?op_sharpen=1\",\n" +
            "\t\t\t\t\"title\": \"NIVEA Lip Balm, Original Care, 4.8g\",\n" +
            "\t\t\t\t\"referenceUri\": \"/nivea-original-care-caring-lip-blam-10226298\"\n" +
            "\t\t\t}\n" +
            "\t\t],\n" +
            "\t\t\"facets\": [\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"categories\",\n" +
            "\t\t\t\t\"text\": \"categories\",\n" +
            "\t\t\t\t\"type\": \"hierarchy\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"beauty & skincare\",\n" +
            "\t\t\t\t\t\t\"text\": \"Beauty & Skincare\",\n" +
            "\t\t\t\t\t\t\"count\": 338,\n" +
            "\t\t\t\t\t\t\"children\": [\n" +
            "\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\"key\": \"beauty & skincare offers\",\n" +
            "\t\t\t\t\t\t\t\t\"text\": \"Beauty & Skincare Offers\",\n" +
            "\t\t\t\t\t\t\t\t\"count\": 2,\n" +
            "\t\t\t\t\t\t\t\t\"children\": [\n" +
            "\t\t\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\t  \n" +
            "\t\t\t\t\t\t\t\t\t\t\"key\": \"all beauty Black Friday\",\n" +
            "\t\t\t\t\t\t\t\t\t\t\"text\": \"All Beauty Black Friday\",\n" +
            "\t\t\t\t\t\t\t\t\t\t\"count\": 2,\n" +
            "                    \"children\":[\n" +
            "                      {\n" +
            "                      \"key\":\"Indian Beauty Black Friday\",\n" +
            "                      \"text\":\"Indian Beauty Black Friday\",\n" +
            "                      \"count\":1\n" +
            "                      }\n" +
            "                    ]\n" +
            "\t\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t\t\t},\n" +
            "\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\"key\": \"beauty edits\",\n" +
            "\t\t\t\t\t\t\t\t\"text\": \"Beauty Edits\",\n" +
            "\t\t\t\t\t\t\t\t\"count\": 1,\n" +
            "\t\t\t\t\t\t\t\t\"children\": [\n" +
            "\t\t\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\t\t\"key\": \"festival looks\",\n" +
            "\t\t\t\t\t\t\t\t\t\t\"text\": \"Festival Looks\",\n" +
            "\t\t\t\t\t\t\t\t\t\t\"count\": 2\n" +
            "\t\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t\t\t},\n" +
            "\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\"key\": \"beauty minis\",\n" +
            "\t\t\t\t\t\t\t\t\"text\": \"Beauty Minis\",\n" +
            "\t\t\t\t\t\t\t\t\"count\": 1\n" +
            "\t\t\t\t\t\t\t},\n" +
            "\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\"key\": \"facial skincare\",\n" +
            "\t\t\t\t\t\t\t\t\"text\": \"facial skincare\",\n" +
            "\t\t\t\t\t\t\t\t\"count\": 4,\n" +
            "\t\t\t\t\t\t\t\t\"children\": [\n" +
            "\t\t\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\t\t\"key\": \"lip balms & creams\",\n" +
            "\t\t\t\t\t\t\t\t\t\t\"text\": \"Lip Balms & Creams\",\n" +
            "\t\t\t\t\t\t\t\t\t\t\"count\": 4\n" +
            "\t\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"black friday\",\n" +
            "\t\t\t\t\t\t\"text\": \"Black Friday\",\n" +
            "\t\t\t\t\t\t\"count\": 59,\n" +
            "\t\t\t\t\t\t\"children\": [\n" +
            "\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\"key\": \"beauty\",\n" +
            "\t\t\t\t\t\t\t\t\"text\": \"Beauty\",\n" +
            "\t\t\t\t\t\t\t\t\"count\": 59\n" +
            "\t\t\t\t\t\t\t},\n" +
            "\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\"key\": \"luxury beauty\",\n" +
            "\t\t\t\t\t\t\t\t\"text\": \"luxury beauty\",\n" +
            "\t\t\t\t\t\t\t\t\"count\": 3\n" +
            "\t\t\t\t\t\t\t},\n" +
            "\t\t\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\t\t\"key\": \"premium beauty\",\n" +
            "\t\t\t\t\t\t\t\t\"text\": \"Premium Beauty\",\n" +
            "\t\t\t\t\t\t\t\t\"count\": 3\n" +
            "\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t]\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"brand\",\n" +
            "\t\t\t\t\"text\": \"brand\",\n" +
            "\t\t\t\t\"type\": \"multiple\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"YVES SAINT LAURENT\",\n" +
            "\t\t\t\t\t\t\"text\": \"YVES SAINT LAURENT\",\n" +
            "\t\t\t\t\t\t\"count\": 22\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"Estee Lauder\",\n" +
            "\t\t\t\t\t\t\"text\": \"Estee Lauder\",\n" +
            "\t\t\t\t\t\t\"count\": 20\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"NYX Professional Makeup\",\n" +
            "\t\t\t\t\t\t\"text\": \"NYX Professional Makeup\",\n" +
            "\t\t\t\t\t\t\"count\": 20\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"Maybelline\",\n" +
            "\t\t\t\t\t\t\"text\": \"Maybelline\",\n" +
            "\t\t\t\t\t\t\"count\": 18\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"promotionalText\",\n" +
            "\t\t\t\t\"text\": \"promotionalText\",\n" +
            "\t\t\t\t\"type\": \"multiple\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"Free gift when you spend £15 on selected makeup and accessories\",\n" +
            "\t\t\t\t\t\t\"text\": \"Free gift when you spend £15 on selected makeup and accessories\",\n" +
            "\t\t\t\t\t\t\"count\": 165\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"Free Gifts when you spend £20 on selected NYX cosmetics\",\n" +
            "\t\t\t\t\t\t\"text\": \"Free Gifts when you spend £20 on selected NYX cosmetics\",\n" +
            "\t\t\t\t\t\t\"count\": 20\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"lack Friday - Save 20 percent on selected NYX Professional Makeup - Online only\",\n" +
            "\t\t\t\t\t\t\"text\": \"lack Friday - Save 20 percent on selected NYX Professional Makeup - Online only\",\n" +
            "\t\t\t\t\t\t\"count\": 18\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"Black Friday - Save 30 percent on Maybelline - Online only\",\n" +
            "\t\t\t\t\t\t\"text\": \"Black Friday - Save 30 percent on Maybelline - Online only\",\n" +
            "\t\t\t\t\t\t\"count\": 17\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"product_type\",\n" +
            "\t\t\t\t\"text\": \"product_type\",\n" +
            "\t\t\t\t\"type\": \"multiple\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"lipstick\",\n" +
            "\t\t\t\t\t\t\"text\": \"lipstick\",\n" +
            "\t\t\t\t\t\t\"count\": 224\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"lip gloss\",\n" +
            "\t\t\t\t\t\t\"text\": \"lip gloss\",\n" +
            "\t\t\t\t\t\t\"count\": 37\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"lip liner\",\n" +
            "\t\t\t\t\t\t\"text\": \"lip liner\",\n" +
            "\t\t\t\t\t\t\"count\": 11\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"lip balm\",\n" +
            "\t\t\t\t\t\t\"text\": \"lip balm\",\n" +
            "\t\t\t\t\t\t\"count\": 8\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"suitable_for\",\n" +
            "\t\t\t\t\"text\": \"suitable_for\",\n" +
            "\t\t\t\t\"type\": \"multiple\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"vegan\",\n" +
            "\t\t\t\t\t\t\"text\": \"vegan\",\n" +
            "\t\t\t\t\t\t\"count\": 1\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"key_features\",\n" +
            "\t\t\t\t\"text\": \"key_features\",\n" +
            "\t\t\t\t\"type\": \"multiple\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"moisturising\",\n" +
            "\t\t\t\t\t\t\"text\": \"moisturising\",\n" +
            "\t\t\t\t\t\t\"count\": 88\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"cruelty-free\",\n" +
            "\t\t\t\t\t\t\"text\": \"cruelty-free\",\n" +
            "\t\t\t\t\t\t\"count\": 72\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"smoothing\",\n" +
            "\t\t\t\t\t\t\"text\": \"smoothing\",\n" +
            "\t\t\t\t\t\t\"count\": 62\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"hydrating\",\n" +
            "\t\t\t\t\t\t\"text\": \"hydrating\",\n" +
            "\t\t\t\t\t\t\"count\": 51\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"ingredients\",\n" +
            "\t\t\t\t\"text\": \"ingredients\",\n" +
            "\t\t\t\t\"type\": \"multiple\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"vitamin e\",\n" +
            "\t\t\t\t\t\t\"text\": \"vitamin e\",\n" +
            "\t\t\t\t\t\t\"count\": 19\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"vitamin c\",\n" +
            "\t\t\t\t\t\t\"text\": \"vitamin c\",\n" +
            "\t\t\t\t\t\t\"count\": 13\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"vitamin a\",\n" +
            "\t\t\t\t\t\t\"text\": \"vitamin a\",\n" +
            "\t\t\t\t\t\t\"count\": 6\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"hyaluronic acid\",\n" +
            "\t\t\t\t\t\t\"text\": \"hyaluronic acid\",\n" +
            "\t\t\t\t\t\t\"count\": 5\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"Colour\",\n" +
            "\t\t\t\t\"text\": \"Colour\",\n" +
            "\t\t\t\t\"type\": \"color\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"Pink#EC69A4\",\n" +
            "\t\t\t\t\t\t\"text\": \"Pink#EC69A4\",\n" +
            "\t\t\t\t\t\t\"count\": 6\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"Red#FF0000\",\n" +
            "\t\t\t\t\t\t\"text\": \"Red#FF0000\",\n" +
            "\t\t\t\t\t\t\"count\": 6\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"BIRTHDAY SUIT\",\n" +
            "\t\t\t\t\t\t\"text\": \"BIRTHDAY SUIT\",\n" +
            "\t\t\t\t\t\t\"count\": 2\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"Barely there\",\n" +
            "\t\t\t\t\t\t\"text\": \"Barely ther\",\n" +
            "\t\t\t\t\t\t\"count\": 2\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"Price range\",\n" +
            "\t\t\t\t\"text\": \"Price range\",\n" +
            "\t\t\t\t\"type\": \"price\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"min\",\n" +
            "\t\t\t\t\t\t\"text\": \"1.2\",\n" +
            "\t\t\t\t\t\t\"count\": 1\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"max\",\n" +
            "\t\t\t\t\t\t\"text\": \"138\",\n" +
            "\t\t\t\t\t\t\"count\": 1\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t},\n" +
            "\t\t\t{\n" +
            "\t\t\t\t\"key\": \"Rating\",\n" +
            "\t\t\t\t\"text\": \"Rating\",\n" +
            "\t\t\t\t\"type\": \"ratings\",\n" +
            "\t\t\t\t\"elements\": [\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"4&above\",\n" +
            "\t\t\t\t\t\t\"text\": \"4&above\",\n" +
            "\t\t\t\t\t\t\"count\": 200\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"3&above\",\n" +
            "\t\t\t\t\t\t\"text\": \"3&above\",\n" +
            "\t\t\t\t\t\t\"count\": 226\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"2&above\",\n" +
            "\t\t\t\t\t\t\"text\": \"2&above\",\n" +
            "\t\t\t\t\t\t\"count\": 234\n" +
            "\t\t\t\t\t},\n" +
            "\t\t\t\t\t{\n" +
            "\t\t\t\t\t\t\"key\": \"1&above\",\n" +
            "\t\t\t\t\t\t\"text\": \"1&above\",\n" +
            "\t\t\t\t\t\t\"count\": 238\n" +
            "\t\t\t\t\t}\n" +
            "\t\t\t\t]\n" +
            "\t\t\t}\n" +
            "\t\t]\n" +
            "\t}\n" +
            "}";
}
