# TLDR

Execute **arbitrary XML-RPC call** to Koji hub

```koji call build '"git+https://src.fedoraproject.org/rpms/pkg.git#commit"' target```

Call build with **scratch** option

```koji call build '"git+https://url#commit"' target --kwargs '{"opts":{"scratch": True}}'```

Call build with **arch override**

```koji call build '"git+https://url#commit"' target --kwargs '{"opts":{"arch_override":"x86_64"}}'```

Call build on **specific channel**

```koji call build '"git+https://url#commit"' target --kwargs '{"channel":"default"}'```

Display **help**

```koji call --help```

# SYNOPSIS

**koji call** [_options_] _function_ [_arguments_]

# DESCRIPTION

**koji call** executes an arbitrary XML-RPC call to the Koji hub. This allows direct access to the Koji API for advanced operations not covered by standard subcommands.

The function signature follows the Koji API, such as `build(src, target, opts=None, priority=None, channel=None)`. Arguments are passed positionally, with complex options provided via `--kwargs`.

# PARAMETERS

**function**
> The XML-RPC function name to call

**--kwargs JSON**
> Pass keyword arguments as JSON object

**--json-output**
> Output results in JSON format

**-h, --help**
> Display help information

# CAVEATS

Requires deep knowledge of the Koji API. Incorrect calls can have unintended effects. JSON syntax must be properly quoted for shell escaping.

# SEE ALSO

[koji](/man/koji)(1), [koji-build](/man/koji-build)(1)
