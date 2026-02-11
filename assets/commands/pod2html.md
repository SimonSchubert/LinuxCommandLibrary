# TAGLINE

Convert Perl POD documentation to HTML

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

**pod2html** converts Perl POD (Plain Old Documentation) files into HTML pages with hyperlinked cross-references. It generates a table of contents from section headings and converts POD formatting directives into appropriate HTML markup.

The **--title** option sets the HTML page title, and **--css** adds a stylesheet link. Use **--index** or **--noindex** to control table of contents generation. Part of the standard Perl distribution.

# CAVEATS

Perl-specific format. Part of standard Perl installation.

# HISTORY

pod2html was created for **Perl POD** documentation conversion.

# SEE ALSO

[pod2man](/man/pod2man)(1), [pod2text](/man/pod2text)(1), [perldoc](/man/perldoc)(1)

