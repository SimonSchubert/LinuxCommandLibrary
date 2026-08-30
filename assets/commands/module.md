# TAGLINE

provides a user interface to the Environment Modules package, enabling dynamic

# TLDR

List the modules **available to load**

```module avail```

**Filter** that list by name

```module avail [gcc]```

Search the **whole hierarchy**, including modules not currently available

```module spider [openmpi]```

Show **what a version needs loaded first** before it becomes available

```module spider [openmpi/4.1.1]```

Search module **descriptions** by keyword

```module keyword [compiler]```

**Load** a module

```module load [gcc/11.2.0]```

Show **what a module actually changes** in the environment

```module show [gcc/11.2.0]```

List what is **loaded right now**

```module list```

**Swap** one module for another

```module swap [gcc] [intel]```

**Unload** a module

```module unload [gcc]```

Unload **everything**

```module purge```

Add a directory of **personal modulefiles**

```module use [path/to/modulefiles]```

**Save** the current set under a name

```module save [collection_name]```

**Restore** a saved set

```module restore [collection_name]```

List the **collections saved**

```module savelist```

# SYNOPSIS

**module** [_switches_] _sub-command_ [_sub-command-args_]

# PARAMETERS

**avail [_pattern_]**
> List available modulefiles matching optional pattern

**load _modulefile_...**
> Load modules into the current environment

**unload _modulefile_...**
> Remove modules from the environment

**list [_pattern_]**
> List currently loaded modules

**purge [-f]**
> Unload all loaded modules

**reload [-f]**
> Unload then reload all modules

**switch _old_ _new_**
> Replace one module with another

**save [_collection_]**
> Save current environment state to collection

**restore [_collection_]**
> Restore saved environment collection

**savelist**
> List saved collections

**display _modulefile_**
> Show modulefile contents and effects

**whatis _string_**
> Search modulefile descriptions

**use _path_...**
> Add directories to modulefile search path

**--json, -j**
> Output in JSON format

**--long, -l**
> Long format output

**--terse, -t**
> Short format output

**-v, --verbose**
> Enable verbose messages

# DESCRIPTION

**module** provides a user interface to the Environment Modules package, enabling dynamic modification of the shell environment through modulefiles. Each modulefile contains configuration for applications, typically modifying PATH, MANPATH, LD_LIBRARY_PATH, and other environment variables.

The system allows users to load and unload software configurations without manual environment variable management. Modulefiles are interpreted as Tcl scripts and can set variables, create aliases, and define dependencies.

Collections allow saving and restoring sets of loaded modules, useful for switching between project configurations or workflows.

# CAVEATS

Modulefiles must begin with the magic cookie #%Module. Loading conflicting modules may cause unexpected behavior unless dependencies are properly defined. The module command modifies the current shell environment; changes are lost when the shell exits unless saved to shell initialization files.

# HISTORY

The **Environment Modules** system originated at DOE computing facilities in the early 1990s. **Lmod**, a Lua-based implementation, was developed at the Texas Advanced Computing Center (TACC) and is widely used on HPC systems. Both provide compatible user interfaces for managing software environments.

# SEE ALSO

