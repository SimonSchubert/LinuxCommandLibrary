# TLDR

**Convert to man page**

```ronn [file.ronn]```

**Convert to HTML**

```ronn --html [file.ronn]```

**Convert to both**

```ronn --roff --html [file.ronn]```

**Preview in browser**

```ronn --server [file.ronn]```

**Specify output directory**

```ronn --output-dir [man/] [file.ronn]```

# SYNOPSIS

**ronn** [_options_] _files_...

# PARAMETERS

**--roff**
> Generate roff (man page).

**--html**
> Generate HTML.

**--fragment**
> HTML fragment only.

**--server**, **-S**
> Preview server.

**--style** _style_
> HTML style.

**--output-dir** _dir_
> Output directory.

**--manual** _name_
> Manual name.

**--organization** _org_
> Organization.

# DESCRIPTION

**Ronn** converts Markdown-like text to Unix man pages and HTML. It uses an extended Markdown syntax for writing manual pages in a readable format.

# EXAMPLES

```bash
# Generate man page
ronn mycommand.1.ronn

# Generate HTML
ronn --html mycommand.1.ronn

# Both formats
ronn --roff --html mycommand.1.ronn

# Preview
ronn --server mycommand.1.ronn

# Install man page
ronn mycommand.1.ronn
sudo cp mycommand.1 /usr/local/share/man/man1/
```

# RONN FORMAT

```markdown
mycommand(1) -- short description
=============================================

## SYNOPSIS

`mycommand` [options] <file>

## DESCRIPTION

Description of the command.

## OPTIONS

  * `-h`, `--help`:
    Show help message.
```

# CAVEATS

Ruby gem (gem install ronn-ng). Filename convention: name.section.ronn.

# HISTORY

Ronn was created by **Ryan Tomayko** to simplify writing man pages. ronn-ng is the maintained fork.

# SEE ALSO

[man](/man/man)(1), [pandoc](/man/pandoc)(1), [groff](/man/groff)(1)
