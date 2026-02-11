# TAGLINE

Generate LaTeX yearly daily planner

# TLDR

Create **daily planner**

```yplan [language] [lettercase] [year] > [path/to/file.tex]```

# SYNOPSIS

**yplan** _LANGUAGE_ _CASE_ _YEAR_

# PARAMETERS

_LANGUAGE_
> Language for day/month names

_CASE_
> Lettercase: uppercase or lowercase

_YEAR_
> Year for the planner

# DESCRIPTION

**yplan** generates LaTeX code for a two-page vertical daily planner for any chosen year. The output can be compiled with pdflatex or other LaTeX processors.

The planner format is designed for printing and binding.

# CAVEATS

Output requires LaTeX processing. Only generates calendar structure, not content.

# SEE ALSO

[pdflatex](/man/pdflatex)(1), [pandoc](/man/pandoc)(1)
