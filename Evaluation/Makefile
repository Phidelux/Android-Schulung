#################################################################
# Makefile (use GNU-Make)
#
# written by Andreas Wilhelm, August, 2012
#
#################################################################

.DEFAULT:
	@echo "This target needs remaking: default = [$<]"
	@echo "Do you really use GNU-Make?"

#----------------------------------------------------------------
# personal configuration
#----------------------------------------------------------------
LATEX_FILE := Evaluation
ARCHIVNAME := Evaluation

# only for archive to put onto web page
SOURCES = ./*

#----------------------------------------------------------------
# generation part
#----------------------------------------------------------------

all: 
	pdflatex $(LATEX_FILE).tex
	find . | egrep ".*((\.(aux|idx|ind|ilg|log|blg|bbl|toc|lof|lot|dvi|tlf|tlt|tpt|lol|nav|snm|vrb))|~)$$" | xargs rm
	rm -f $(LATEX_FILE).out $(LATEX_FILE).ps thumb???.png thumbdta.tex thumbpdf.*
	rm -rf auto

view: $(LATEX_FILE).tex
	evince $(LATEX_FILE).pdf &

#----------------------------------------------------------------
# utility part
#----------------------------------------------------------------

.PHONY: clean archive x concat

clean:
	- find . | egrep ".*((\.(aux|idx|ind|ilg|log|blg|bbl|toc|lof|lot|dvi|tlf|tlt|tpt|tdo|lol|nav|snm|vrb))|~)$$" | xargs rm
	- rm -f $(LATEX_FILE).out $(LATEX_FILE).ps $(LATEX_FILE).pdf thumb???.png thumbdta.tex thumbpdf.*
	- rm -rf auto

archive:
	- @ echo "Making archive..."
	- tar -czvf $(ARCHIVNAME).tar.gz $(SOURCES)
	- @ echo "Archive ready."

x:
	TERM=emacs; xemacs21-mule Makefile *.tex *.sty &

#end of Makefile
