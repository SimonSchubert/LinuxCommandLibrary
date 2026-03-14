# TAGLINE

Argos Translate package manager for offline translation models

# TLDR

**Update** the remote package index

```argospm update```

**Search** for a translation package

```argospm search --from-lang [en] --to-lang [es]```

**Install** a translation package

```argospm install [translate-en_es]```

**List** installed translation packages

```argospm list```

**Remove** an installed translation package

```argospm remove [translate-en_es]```

# SYNOPSIS

**argospm** [**-h**] {**update**,**search**,**install**,**list**,**remove**} [_args_]

# PARAMETERS

**update**
> Download the remote package index from the Argos Translate package repository.

**search**
> Search for available translation packages in the remote index. Use **--from-lang** and **--to-lang** to filter by language pair.

**install**
> Install a translation package by name (e.g., translate-en_es).

**list**
> List all currently installed translation packages.

**remove**
> Remove an installed translation package by name.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**argospm** is the package management CLI for **Argos Translate**, an open-source offline translation library. It manages the download and installation of translation language packages (neural machine translation models) that enable offline text translation between language pairs.

Each package provides translation between a specific source and target language. Packages are downloaded from the Argos Translate package index and stored locally for use by the **argos-translate** Python library and **LibreTranslate** web interface.

# CAVEATS

Translation packages can be large as they contain neural network models. The package index must be updated with **argospm update** before searching or installing new packages. Quality varies between language pairs — well-resourced language pairs like English-Spanish have better translation quality than less common pairs.

# HISTORY

**argospm** is part of the **Argos Translate** project, an open-source neural machine translation library built in **Python** using **OpenNMT**. The project was created by **Argos Open Technologies** to provide free, offline translation capabilities as an alternative to cloud-based services. It also powers **LibreTranslate**, a self-hosted translation API.

# SEE ALSO

[argos-translate](/man/argos-translate)(1), [trans](/man/trans)(1), [pip](/man/pip)(1)
