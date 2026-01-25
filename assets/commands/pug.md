# TLDR

**Compile Pug to HTML**

```pug [file.pug]```

**Compile to specific output**

```pug [file.pug] -o [output/]```

**Watch for changes**

```pug -w [file.pug]```

**Pretty output**

```pug -P [file.pug]```

**Compile directory**

```pug [src/] -o [dist/]```

# SYNOPSIS

**pug** [_options_] _files_...

# PARAMETERS

**-o**, **--out** _dir_
> Output directory.

**-P**, **--pretty**
> Pretty print output.

**-w**, **--watch**
> Watch for changes.

**-c**, **--client**
> Compile for client-side.

**-O**, **--obj** _json_
> Locals object.

**--name** _name_
> Template function name.

# DESCRIPTION

**Pug** (formerly Jade) is a template engine for Node.js. It compiles to HTML with a clean, whitespace-sensitive syntax that eliminates closing tags.

# EXAMPLES

```bash
# Compile file
pug index.pug

# Pretty output
pug -P template.pug

# Watch directory
pug -w -P views/ -o public/

# With data
pug -O '{"title":"Hello"}' page.pug

# Client-side template
pug -c template.pug
```

# PUG SYNTAX

```pug
doctype html
html
  head
    title= pageTitle
  body
    h1 Hello World
    p.intro Welcome
    ul
      each item in items
        li= item
```

# CAVEATS

Requires Node.js. Whitespace-sensitive (use consistent indentation). Was renamed from Jade due to trademark.

# HISTORY

Pug was created by **TJ Holowaychuk** as Jade in 2010, renamed to Pug in 2016 due to trademark issues.

# SEE ALSO

[ejs](/man/ejs)(1), [handlebars](/man/handlebars)(1), [node](/man/node)(1)
