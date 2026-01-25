# TLDR

**Add document from file**

```papis add [document.pdf]```

**Add with metadata**

```papis add --set author "[Name]" --set title "[Title]" [document.pdf]```

**Search library**

```papis open "[query]"```

**Export to BibTeX**

```papis export --format bibtex "[query]"```

**Edit document metadata**

```papis edit "[query]"```

**List all documents**

```papis list```

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

**--set** _field_ _value_
> Set metadata field.

# DESCRIPTION

**papis** is a command-line bibliography manager. It stores documents and metadata in a folder structure, supports multiple libraries, and integrates with editors and reference managers.

Documents are stored with YAML metadata files.

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

Python required. Multiple library support. Integrates with vim, emacs. DOI lookup supported.

# HISTORY

papis was created by **Alejandro Gallo** as a command-line alternative to GUI reference managers like Zotero.

# SEE ALSO

[zotero](/man/zotero)(1), [jabref](/man/jabref)(1), [mendeley](/man/mendeley)(1)
