# TAGLINE

executes an arbitrary XML-RPC call to the Koji hub

# TLDR

Get **build information** as JSON (anonymous call)

```koji --noauth call --json-output getBuild [nvr]```

Pass **keyword arguments** as NAME=VALUE

```koji call listTagged [tag] latest=True```

Execute **arbitrary XML-RPC call** to Koji hub

```koji call build 'git+https://src.fedoraproject.org/rpms/pkg.git#commit' target```

Call build with **scratch** option (Python syntax)

```koji call build '"git+https://url#commit"' target --kwargs '{"opts":{"scratch": True}}'```

Call build with **arch override**

```koji call build '"git+https://url#commit"' target --kwargs '{"opts":{"arch_override":"x86_64"}}'```

Call build on **specific channel**

```koji call build '"git+https://url#commit"' target --kwargs '{"channel":"default"}'```

List **available hub methods**

```koji call _listapi```

Display **help**

```koji call --help```

# SYNOPSIS

**koji call** [_options_] _name_ [_arg_...]

# DESCRIPTION

**koji call** executes an arbitrary XML-RPC call to the Koji hub. This allows direct access to the Koji API for advanced operations not covered by standard subcommands.

The function signature follows the Koji API, such as `build(src, target, opts=None, priority=None, channel=None)`. Arguments are passed positionally; arguments of the form **NAME=VALUE** become keyword arguments, and a whole dictionary of keyword arguments can be given with **--kwargs**.

By default each value is converted to an integer, float, **None**, **True** or **False** where possible and otherwise passed as a plain string. With **--python** or **--json-input**, values are parsed as Python literals or JSON instead, so strings must then be quoted.

# PARAMETERS

**name**
> The XML-RPC method name to call

**-p, --python**
> Parse argument values using Python literal syntax

**--kwargs** _DICT_
> Keyword arguments as a dictionary (implies --python unless --json-input is given)

**-j, --json**
> Use JSON syntax for both input and output

**--json-input**
> Parse argument values as JSON

**--json-output**
> Print the result as JSON instead of Python pretty-print

**-b, --bare-strings**
> Treat values that are not valid JSON/Python as plain strings

**-h, --help**
> Display help information

# CAVEATS

Requires deep knowledge of the Koji API. Incorrect calls can have unintended effects. JSON and Python syntax must be properly quoted for shell escaping. Use the global **--noauth** option for anonymous read-only calls.

# INSTALL

```dnf: sudo dnf install koji```

```brew: brew install koji```

```nix: nix profile install nixpkgs#koji```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[koji](/man/koji)(1), [koji-build](/man/koji-build)(1), [koji-buildinfo](/man/koji-buildinfo)(1)

# RESOURCES

```[Source code](https://forge.fedoraproject.org/koji/koji)```

```[Homepage](https://koji.build/)```

```[Documentation](https://docs.pagure.org/koji/)```

<!-- verified: 2026-09-29 -->
