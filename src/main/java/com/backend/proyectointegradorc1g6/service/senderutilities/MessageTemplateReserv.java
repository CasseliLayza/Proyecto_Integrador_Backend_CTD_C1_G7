package com.backend.proyectointegradorc1g6.service.senderutilities;

public class MessageTemplateReserv {

    public static final String TEMPLATE_MESSAGE_RESERV="<!DOCTYPE html>\n" +
            "<html lang=\"es\">\n" +
            "\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "    <title>Bienvenido</title>\n" +
            "    <style>\n" +
            "        body {\n" +
            "            font-family: Arial, sans-serif;\n" +
            "            background-color: #f4f4f7;\n" +
            "            color: #333;\n" +
            "            margin: 0;\n" +
            "            padding: 0;\n" +
            "        }\n" +
            "\n" +
            "        .container {\n" +
            "            max-width: 600px;\n" +
            "            margin: 0 auto;\n" +
            "            padding: 20px;\n" +
            "            background-color: #ffffff;\n" +
            "            border-radius: 8px;\n" +
            "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\n" +
            "        }\n" +
            "\n" +
            "        .header {\n" +
            "            text-align: center;\n" +
            "            padding: 10px 0;\n" +
            "            background-color: #0a0a0a;\n" +
            "            color: white;\n" +
            "            border-radius: 8px 8px 0 0;\n" +
            "        }\n" +
            "\n" +
            "        .header h1 {\n" +
            "            margin: 0;\n" +
            "            font-size: 24px;\n" +
            "        }\n" +
            "\n" +
            "        .content {\n" +
            "            padding: 20px;\n" +
            "        }\n" +
            "\n" +
            "        .content h2 {\n" +
            "            color: #111211;\n" +
            "        }\n" +
            "\n" +
            "        .content p {\n" +
            "            line-height: 1.6;\n" +
            "        }\n" +
            "\n" +
            "        .btn {\n" +
            "            display: inline-block;\n" +
            "            margin-top: 20px;\n" +
            "            padding: 12px 24px;\n" +
            "            font-size: 16px;\n" +
            "            color: #ffffff;\n" +
            "            background-color: #afa54c;\n" +
            "            text-decoration: none;\n" +
            "            border-radius: 5px;\n" +
            "            text-align: center;\n" +
            "        }\n" +
            "\n" +
            "        .footer {\n" +
            "            margin-top: 20px;\n" +
            "            text-align: center;\n" +
            "            font-size: 12px;\n" +
            "            color: #aaa;\n" +
            "        }\n" +
            "    </style>\n" +
            "</head>\n" +
            "\n" +
            "<body>\n" +
            "    <div class=\"container\">\n" +
            "        <div class=\"header\">\n" +
            "            <img src=\"[Logo Royal Ride]\" width=\"100\" alt=\"Logo de la Empresa\">\n" +
            "            <h1>¡Reservaciones Royal Ride!</h1>\n" +
            "        </div>\n" +
            "        <div class=\"content\">\n" +
            "            <h2>Estimad@, [Nombre del Usuario]</h2>\n" +
            "            <p>Correo de registro: <strong>[Correo del Usuario]</strong></p>\n" +
            "            <p>Modelo de auto: <strong>[Modelo de auto]</strong></p>\n" +
            "            <p>Matricula de auto: <strong>[Matricula de auto]</strong></p>\n" +
            "            <p>Recogida:\n" +
            "                <strong>[Fecha de salida]</strong>\n" +
            "                <strong>[Lugar de salida]</strong>\n" +
            "            </p>\n" +
            "            <p>Retorno:\n" +
            "                <strong>[Fecha de retorno]</strong>\n" +
            "                <strong>[Lugar de retorno]</strong>\n" +
            "            </p>\n" +
            "            <p>Dias: <strong>[Cantidad de dias]</strong></p>\n" +
            "            <p>Precio: <strong>[Precio final]</strong></p>\n" +
            "            <p>\n" +
            "                ¡Gracias por elegir nuestro servicio de reservas de autos! Estamos encantados de tenerte con nosotros.\n" +
            "                Ahora puedes disfrutar de todo el confort y beneficios de nuestro servicio diseñados especialmente para\n" +
            "                ti.\n" +
            "            </p>\n" +
            "            <p>\n" +
            "                Si tienes alguna consulta, duda o inquietud, no dudes en contactarnos. Puedes escribirnos a\n" +
            "                <strong>royal.ride.customers@gmail.com</strong> o simplemente haz clic en el botón\n" +
            "                de abajo para comunicarte con tu ejecutivo, estaremos encantados de ayudarte!.\n" +
            "            </p>\n" +
            "            <a href=\"[URL de inicio de sesion]\" class=\"btn\">contactanos</a>\n" +
            "        </div>\n" +
            "        <div class=\"footer\">\n" +
            "            <p>Si tienes alguna pregunta, no dudes en ponerte en contacto con nuestro equipo de soporte.</p>\n" +
            "            <p>© 2024 Royal Ride. Todos los derechos reservados.</p>\n" +
            "        </div>\n" +
            "    </div>\n" +
            "</body>\n" +
            "\n" +
            "</html>";
}
