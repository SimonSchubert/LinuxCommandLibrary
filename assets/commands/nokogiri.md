# TAGLINE

ruby HTML/XML parser CLI

# TLDR

**Parse HTML file**

```nokogiri [file.html]```

**Fetch and parse URL**

```nokogiri [https://example.com]```

**Parse with CSS selector**

```nokogiri [file.html] -e "[doc.css('h1').text]"```

**Parse XML**

```nokogiri [file.xml] --type xml```

**Drop into an IRB session** with the document bound to `doc`

```nokogiri [file.html]```

**Validate against a RelaxNG schema**

```nokogiri [file.xml] --rng [schema.rng]```

# SYNOPSIS

**nokogiri** [_options_] [_file_or_url_]

# PARAMETERS

_FILE_OR_URL_
> HTML/XML file path or URL to parse. If absent, the document is read from stdin.

**-e** _CODE_
> Execute Ruby _CODE_ against the parsed document (which is bound to **doc**).

**--type** _TYPE_
> Document type: **xml** or **html**. Defaults to autodetection by content type / extension.

**-C** _FILE_
> Load a custom Ruby initialization file. Default: **~/.nokogirirc**.

**-E**, **--encoding** _ENCODING_
> Read input using the named character encoding (e.g. UTF-8, ISO-8859-1).

**--rng** _URI_OR_PATH_
> Validate the document against the given RelaxNG schema.

**-v**, **--version**
> Show the Nokogiri version.

**-?**, **--help**
> Display help.

# DESCRIPTION

**nokogiri** is the command-line front-end for the Nokogiri Ruby gem, a fast HTML/XML parser backed by libxml2 and libxslt. The CLI parses a file, URL, or stdin into a **Nokogiri::HTML::Document** or **Nokogiri::XML::Document** (bound as **doc**) and either drops you into an IRB session or runs the Ruby snippet supplied with **-e** so you can query it with CSS selectors (**doc.css**) or XPath (**doc.xpath**).

# CAVEATS

Requires Ruby and the **nokogiri** gem (`gem install nokogiri`). The **-i** interactive flag is not part of the modern CLI — running **nokogiri** _file_ on a TTY drops into IRB by default; pass **-e** to run non-interactively. Fetching URLs uses **open-uri**, so HTTPS sites need OpenSSL support in the underlying Ruby build.

# HISTORY

**Nokogiri** (Japanese for "saw") was created by **Aaron Patterson** and **Mike Dalessio** in **2008** as a faster, libxml2-backed alternative to Hpricot. It is one of the most-installed Ruby gems and ships a small CLI for ad-hoc parsing and validation.

# INSTALL

```apt: sudo apt install ruby-nokogiri```

```pacman: sudo pacman -S ruby-nokogiri```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xmllint](/man/xmllint)(1), [pup](/man/pup)(1), [xidel](/man/xidel)(1)

