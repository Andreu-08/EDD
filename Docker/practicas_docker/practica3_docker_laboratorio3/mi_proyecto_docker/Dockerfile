FROM nginx:latest

COPY index_Andreu.html /usr/share/nginx/html/index.html
COPY index_juan.html /usr/share/nginx/html/index_juan.html
COPY index_pedro.html /usr/share/nginx/html/index_pedro.html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
