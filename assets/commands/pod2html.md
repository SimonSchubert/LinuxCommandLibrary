# TLDR

**Convert POD to HTML**

```pod2html --infile=[file.pod] --outfile=[file.html]```

**Convert with title**

```pod2html --title="[Title]" [file.pod] > [file.html]```

**Include CSS**

```pod2html --css=[style.css] [file.pod] > [file.html]```

# SYNOPSIS

**pod2html** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input POD file.

**--infile** _FILE_
> Input file.

**--outfile** _FILE_
> Output file.

**--title** _TITLE_
> HTML title.

**--css** _URL_
> CSS stylesheet link.

**--index**
> Generate index.

**--noindex**
> Skip index generation.

# DESCRIPTION

**pod2html** converts Perl POD documentation to HTML. Part of Perl distribution.

The tool creates web-viewable documentation. Generates hyperlinked pages.

pod2html creates HTML docs.

# CAVEATS

Perl-specific format. Part of standard Perl installation.

# HISTORY

pod2html was created for **Perl POD** documentation conversion.

# SEE ALSO

[pod2man](/man/pod2man)(1), [pod2text](/man/pod2text)(1), [perldoc](/man/perldoc)(1)

