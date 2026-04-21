# TAGLINE

Convert Perl POD documentation to HTML

# TLDR

**Convert POD file to HTML**

```pod2html --infile=[file.pod] --outfile=[file.html]```

**Convert with a custom HTML title**

```pod2html --title="[My Module]" --infile=[file.pod] --outfile=[file.html]```

**Include an external CSS stylesheet**

```pod2html --css=[style.css] --infile=[file.pod] --outfile=[file.html]```

**Convert without generating a table of contents**

```pod2html --noindex --infile=[file.pod] --outfile=[file.html]```

**Add backlinks from headings back to the top of the page**

```pod2html --backlink --infile=[file.pod] --outfile=[file.html]```

**Flush the pod2html cache before conversion**

```pod2html --flush --infile=[file.pod] --outfile=[file.html]```

# SYNOPSIS

**pod2html** [_options_]

# PARAMETERS

**--infile=**_name_
> POD input file. Defaults to STDIN.

**--outfile=**_name_
> HTML output file. Defaults to STDOUT.

**--title=**_name_
> Set the HTML document title.

**--css=**_URL_
> Link to a cascading style sheet.

**--index** / **--noindex**
> Include or omit a table of contents at the top of the HTML output. Enabled by default.

**--backlink** / **--nobacklink**
> Add links from each heading back to the top of the page.

**--header** / **--noheader**
> Emit banner headers and footers derived from the POD NAME section.

**--htmldir=**_name_
> Directory used when generating relative cross-references to other HTML files.

**--htmlroot=**_URL_
> Base URL for absolute HTML cross-reference links.

**--podpath=**_dirs_
> Colon-separated list of directories containing pod files used for resolving L<> links.

**--podroot=**_name_
> Base directory for library pod files.

**--cachedir=**_name_
> Directory in which pod2html stores its cache. Default: current directory.

**--flush**
> Clear the cache before processing.

**--recurse** / **--norecurse**
> Recurse into subdirectories specified by **--podpath**.

**--quiet** / **--verbose**
> Suppress warnings or show progress messages.

**--poderrors** / **--nopoderrors**
> Include or omit a POD errors section in the output.

# DESCRIPTION

**pod2html** converts Perl POD (Plain Old Documentation) source into HTML, resolving L<> hyperlinks and converting POD formatting directives to HTML markup. It can optionally prepend a table of contents built from =head directives and insert backlinks between headings and the top of the document.

The utility relies on a cache (by default stored in the working directory) that maps pod names to URLs so that cross-references between pages are resolved efficiently across multiple runs. Use **--flush** after moving or renaming source pods.

# CAVEATS

The cache is created in the current directory by default and can surprise users who expect a stateless tool; use **--cachedir** to relocate it or **--flush** to rebuild it.

# HISTORY

**pod2html** ships with the standard Perl distribution as part of the Pod::Html module and has been included since early Perl 5 releases.

# SEE ALSO

[pod2man](/man/pod2man)(1), [pod2text](/man/pod2text)(1), [perldoc](/man/perldoc)(1), [perl](/man/perl)(1)
