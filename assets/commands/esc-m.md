# TAGLINE

Module manager for Escargot JavaScript engine

# TLDR

**List Escargot** modules

```esc-m list```

**Install module**

```esc-m install [module_name]```

**Remove module**

```esc-m remove [module_name]```

# SYNOPSIS

**esc-m** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: list, install, remove.

**list**
> List installed modules.

**install** _MODULE_
> Install module.

**remove** _MODULE_
> Remove module.

**--help**
> Display help information.

# DESCRIPTION

**esc-m** is a module manager for Escargot, a lightweight JavaScript engine. It handles installation and management of JavaScript modules for Escargot-based applications.

The tool provides basic package management functionality for the Escargot ecosystem, enabling modular development on resource-constrained devices where Escargot is commonly used.

# CAVEATS

Limited to Escargot ecosystem. Smaller module selection than npm. Device-specific considerations may apply.

# HISTORY

esc-m supports **Escargot**, a lightweight JavaScript engine developed by **Samsung** for IoT and embedded devices where memory and CPU resources are limited.

# SEE ALSO

[npm](/man/npm)(1), [node](/man/node)(1)
