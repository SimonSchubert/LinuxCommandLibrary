# TLDR

**Render document to output format**

```quarto render [document.qmd]```

**Render entire project**

```quarto render```

**Preview document with live reload**

```quarto preview [document.qmd]```

**Create new project**

```quarto create project [website]```

**Publish to Quarto Pub**

```quarto publish quarto-pub```

**Convert Jupyter notebook to Quarto**

```quarto convert [notebook.ipynb]```

**Install extensions**

```quarto add [quarto-ext/fontawesome]```

**Check installation**

```quarto check```

# SYNOPSIS

**quarto** _command_ [_options_] [_arguments_]

# PARAMETERS

**render** [_input_]
> Render document or project.

**preview** [_input_]
> Live preview with auto-reload.

**create** _type_ [_name_]
> Create project or extension.

**publish** _provider_
> Publish to hosting service.

**add** _extension_
> Install extension.

**remove** _extension_
> Remove extension.

**update** _extension_
> Update extension.

**convert** _file_
> Convert between formats.

**check** [_component_]
> Verify installation.

**install** _tool_
> Install optional tools.

**--to** _FORMAT_
> Output format (html, pdf, docx, etc.).

**--output** _FILE_
> Output file name.

**--execute**
> Execute code cells.

**--no-execute**
> Skip code execution.

**--cache**
> Cache code execution results.

**--port** _NUM_
> Preview server port.

**--browser**
> Open in browser.

# DESCRIPTION

**Quarto** is an open-source publishing system for technical and scientific documents. It extends Pandoc with support for executable code cells in Python, R, Julia, and Observable JS.

Documents use .qmd (Quarto Markdown) format combining narrative text with code cells. Code executes during rendering, embedding outputs (plots, tables, results) in the final document.

Output formats include HTML, PDF, Word, presentations (RevealJS, Beamer), websites, and books. Projects organize multiple documents with shared configuration.

The preview command provides live development with automatic re-rendering on file changes. Hot module replacement updates the browser without full refresh.

Extensions add features: custom formats, shortcodes, filters, and themes. The extension ecosystem provides templates for journals, presentations, and specialized outputs.

Publishing integrates with Quarto Pub, GitHub Pages, Netlify, Posit Connect, and other platforms. Single command deployment updates hosted content.

# CAVEATS

Requires Jupyter or knitr for code execution. Large documents with heavy computation slow rendering. PDF output requires LaTeX installation. Some extensions may break with Quarto updates. Preview server can be resource-intensive.

# HISTORY

**Quarto** was released by **Posit** (formerly RStudio) in **2022** as a next-generation version of R Markdown. It was designed to be language-agnostic, supporting Python and Julia equally with R. The name "quarto" refers to a book format and continues the printing/publishing theme from R Markdown.

# SEE ALSO

[pandoc](/man/pandoc)(1), [jupyter](/man/jupyter)(1), [rmarkdown](/man/rmarkdown)(1), [marp](/man/marp)(1)
