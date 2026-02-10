# TAGLINE

creates online books by writing Markdown files

# TLDR

**Create** an mdbook project in the current directory

```mdbook init```

Create an mdbook project in a **specific directory**

```mdbook init [path/to/directory]```

**Clean** the directory with the generated book

```mdbook clean```

**Serve** a book at http://localhost:3000, auto-build when file changes

```mdbook serve```

**Watch** Markdown files and automatically build when a file is changed

```mdbook watch```

# SYNOPSIS

**mdbook** _command_ [_options_]

# PARAMETERS

**init**
> Create a new mdbook project with default structure

**build**
> Build the book from Markdown sources

**serve**
> Start a local web server with live reload

**watch**
> Rebuild automatically when source files change

**clean**
> Remove the generated book output directory

**test**
> Test Rust code samples in the book

# DESCRIPTION

**mdbook** creates online books by writing Markdown files. Developed by the Rust community, it compiles a collection of Markdown files into a static website with navigation, search, and theming support.

A typical mdbook project contains a **SUMMARY.md** file that defines the book's structure and chapter organization. The tool processes these files and generates HTML, with support for code syntax highlighting, MathJax equations, and custom themes.

The **serve** command is particularly useful during writing, providing a local development server that automatically rebuilds and refreshes the browser when files change.

# CAVEATS

Requires Rust code blocks to be syntactically valid if **mdbook test** is used. Large books may have slow build times. Custom themes require understanding of Handlebars templating. Search functionality is client-side JavaScript.

# HISTORY

mdbook was created by the Rust community as the tool for writing Rust documentation and "The Rust Programming Language" book. It has since become popular for technical documentation beyond Rust projects.

# SEE ALSO

[pandoc](/man/pandoc)(1), [hugo](/man/hugo)(1), [mkdocs](/man/mkdocs)(1)
