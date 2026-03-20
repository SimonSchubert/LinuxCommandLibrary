# TAGLINE

command-line bibliography manager

# TLDR

**Add document from file**

```papis add [document.pdf]```

**Add with metadata**

```papis add --set author "[Name]" --set title "[Title]" [document.pdf]```

**Add a document from a DOI**

```papis add --from doi [10.1007/s00214-007-0422-6]```

**Search and open a document**

```papis open "[query]"```

**Export to BibTeX**

```papis export --format bibtex "[query]"```

**Edit document metadata**

```papis edit "[query]"```

**List all documents matching a query**

```papis list "[query]"```

# SYNOPSIS

**papis** _command_ [_options_] [_args_]

# PARAMETERS

**add**
> Add document.

**open**
> Open document.

**edit**
> Edit metadata.

**export**
> Export references.

**list**
> List documents.

**browse**
> Open in browser.

**rm**
> Remove document.

**rename**
> Rename document folder.

**doctor**
> Check and fix document metadata.

**cite**
> Retrieve citation information.

**--set** _field_ _value_
> Set metadata field.

**-l** **--lib** _library_
> Use specified library.

**--from** _importer_
> Import from source: doi, arxiv, bibtex, crossref, pmid, yaml, folder, pdf2doi.

# DESCRIPTION

**papis** is a command-line bibliography manager. It stores documents and metadata in a folder structure, supports multiple libraries, and integrates with editors and reference managers.

# LIBRARY STRUCTURE

```
~/Documents/papers/
├── author2023title/
│   ├── info.yaml
│   └── document.pdf
```

# CONFIGURATION

```yaml
# ~/.config/papis/config
[papers]
dir = ~/Documents/papers

[books]
dir = ~/Documents/books
```

# CAVEATS

Python required. Multiple library support. Integrates with Vim, Emacs, and offers TUI interfaces. DOI and arXiv lookup supported.

# HISTORY

papis was created by **Alejandro Gallo** as a command-line alternative to GUI reference managers like Zotero.

# SEE ALSO

[zotero](/man/zotero)(1), [jabref](/man/jabref)(1), [mendeley](/man/mendeley)(1)
