# TAGLINE

package manager for OCaml libraries

# TLDR

**Compile with package**

```ocamlfind ocamlc -package [str] -linkpkg [program.ml] -o [program]```

**Compile native with packages**

```ocamlfind ocamlopt -package [core,yojson] -linkpkg [program.ml] -o [program]```

**List installed packages**

```ocamlfind list```

**Show package info**

```ocamlfind query [package]```

**Show package directory**

```ocamlfind query -d [package]```

**Show package dependencies**

```ocamlfind query -r [package]```

**Install package**

```ocamlfind install [package] META [*.cmi] [*.cmo] [*.cma]```

**Remove package**

```ocamlfind remove [package]```

# SYNOPSIS

**ocamlfind** [_ocamlc_] [_ocamlopt_] [_query_] [_list_] [_install_] [_-package pkgs_] [_options_] [_files_]

# PARAMETERS

**ocamlc** _ARGS_
> Run bytecode compiler.

**ocamlopt** _ARGS_
> Run native compiler.

**query** _PKG_
> Query package information.

**list**
> List installed packages.

**install** _PKG_ _FILES_
> Install package.

**remove** _PKG_
> Remove package.

**-package** _PKGS_
> Packages to use (comma-separated).

**-linkpkg**
> Link packages into executable.

**-predicates** _PREDS_
> Set predicates.

**-syntax** _SYNTAX_
> Set syntax extension.

**-d**
> Show package directory.

**-r**
> Recursive dependencies.

# DESCRIPTION

**ocamlfind** is the package manager for OCaml libraries. It locates installed packages and configures compiler invocations automatically.

The tool wraps OCaml compilers, adding include paths and library references based on package specifications. This simplifies builds by handling library dependencies.

Each package has a META file describing its components, dependencies, and locations. Query commands extract this information for build systems and scripts.

Package installation places libraries in a central repository with META files. This standardized layout enables reliable discovery and linking.

Dependencies are resolved transitively. Specifying a high-level package automatically includes its prerequisites.

Integration with build systems like Dune is common. Many projects use ocamlfind directly or through wrapper tools.

# CAVEATS

Replaced by opam for package installation in modern projects. Manual META file creation can be error-prone. Not all packages include META files.

# HISTORY

**ocamlfind** (findlib) was created by **Gerd Stolpmann** starting in the early **2000s** to standardize OCaml library management. It became the foundation for OCaml's package ecosystem, later complemented by opam for downloading and installing packages.

# SEE ALSO

[ocaml](/man/ocaml)(1), [ocamlc](/man/ocamlc)(1), [ocamlopt](/man/ocamlopt)(1), [opam](/man/opam)(1), [dune](/man/dune)(1)
