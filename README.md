# presentations

TeX source for [Beamer](https://www.sharelatex.com/learn/Beamer) presentations on various topics. Often accompanied by source code in various programming languages. Presentations typically use the [Metropolis theme](https://github.com/matze/mtheme).

Note: In the following, a _presentation directory_ is **not** the repository root itself, but any directory containing the TeX and other source code for a given presentation. Presentation directories are all located in the repository root.

## Including software source code

Most presentations here include extracts of source code in various programming languages. The LaTeX [Listings package](http://texdoc.net/texmf-dist/doc/latex/listings/listings.pdf) allows us to achieve this easily and beautifully (we think). Code extracts are usually imported directly from dedicated source packages in the presentation directory (though some is inline in the TeX source). This allows us to write the source code as a working program. You can see an example of this in the presentation directory 'functional_programming'.

In order to align with the compilation process outlined below, when importing source code from dedicated files, we recommend providing paths relative to the presentation directory rather than the TeX source.

## Compilation

Due to font requirements, compiling these presentations requires XeLaTeX. On Unix, we recommend using Docker (see [installation instructions](https://docs.docker.com/engine/installation/)), with
```bash
./compile.sh <presentation directory e.g. functional_programming>
```
Alternatively, use XeLaTeX directly from within a presentation directory with
```bash
xelatex tex/presentation.tex
```

The compiled PDF (and auxiliary files) can then be found in the corresponding presentation directory.
