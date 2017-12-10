FROM debian

RUN apt-get update && apt-get install -y texlive-xetex

WORKDIR /opt/presentation

CMD xelatex tex/presentation.tex
