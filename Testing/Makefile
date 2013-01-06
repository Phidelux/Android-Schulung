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
OUTPUT_FILE := Testing
INPUT_FILE := Beamer
LATEX_FILE := ./content/Beamer
ARCHIVNAME := Testing

# only for archive to put onto web page
SOURCES = ./*

#----------------------------------------------------------------
# generation part
#----------------------------------------------------------------

all: $(OUTPUT_FILE).dvi

# so much iterations are only necessary for final versions!
$(OUTPUT_FILE).dvi: $(LATEX_FILE).tex
	latex $(LATEX_FILE).tex
	latex $(LATEX_FILE).tex
	dvips -Ppdf -o $(OUTPUT_FILE).ps $(INPUT_FILE).dvi
	ps2pdf $(OUTPUT_FILE).ps
	find . | egrep ".*((\.(aux|idx|ind|ilg|log|blg|bbl|toc|lof|lot|dvi|tlf|tlt|tpt|lol|nav|snm|vrb))|~)$$" | xargs rm
	rm -f $(INPUT_FILE).out $(OUTPUT_FILE).ps thumb???.png thumbdta.tex thumbpdf.*
	rm -rf auto

view: $(OUTPUT_FILE).pdf
	evince $(OUTPUT_FILE).pdf &

#----------------------------------------------------------------
# utility part
#----------------------------------------------------------------

.PHONY: clean archive x concat

clean:
	- find . | egrep ".*((\.(aux|idx|ind|ilg|log|blg|bbl|toc|lof|lot|dvi|tlf|tlt|tpt|tdo|lol|nav|snm|vrb))|~)$$" | xargs rm
	- rm -f $(INPUT_FILE).out $(OUTPUT_FILE).ps $(OUTPUT_FILE).pdf thumb???.png thumbdta.tex thumbpdf.*
	- rm -rf auto

archive:
	- @ echo "Making archive..."
	- tar -czvf $(ARCHIVNAME).tar.gz $(SOURCES)
	- @ echo "Archive ready."

x:
	TERM=emacs; xemacs21-mule Makefile *.tex *.sty &

#end of Makefile
