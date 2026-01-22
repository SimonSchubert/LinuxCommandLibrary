# TLDR

**Format file and output to stdout**

```clang-format [file.cpp]```

**Format file in place**

```clang-format -i [file.cpp]```

**Format with specific style**

```clang-format --style=[Google] [file.cpp]```

**Format using project config file**

```clang-format --style=file [file.cpp]```

**Format code from stdin**

```echo "int main(){}" | clang-format```

**Generate style config file**

```clang-format --style=[LLVM] --dump-config > [.clang-format]```

**Format specific lines only**

```clang-format --lines=[10:20] [file.cpp]```

**Check if file is formatted**

```clang-format --dry-run --Werror [file.cpp]```

# SYNOPSIS

**clang-format** [_options_] [_file_...]

# DESCRIPTION

**clang-format** formats C, C++, Java, JavaScript, JSON, Objective-C, Protobuf, and C# code according to configurable style rules. It's part of the LLVM/Clang project.

# PARAMETERS

**-i**
> Edit files in place

**--style**=_style_
> Coding style (LLVM, Google, Chromium, Mozilla, WebKit, Microsoft, file)

**--dump-config**
> Dump configuration to stdout

**--assume-filename**=_name_
> Filename for language detection when reading stdin

**--lines**=_start:end_
> Format only specified line range

**--dry-run**
> Don't write changes, exit with error if changes needed

**--Werror**
> Treat formatting issues as errors

**--fallback-style**=_style_
> Style when no .clang-format found

**--verbose**
> Show files being processed

# CONFIGURATION

Create **.clang-format** or **_clang-format** in project root:

```yaml
BasedOnStyle: Google
IndentWidth: 4
ColumnLimit: 100
```

# PREDEFINED STYLES

LLVM, Google, Chromium, Mozilla, WebKit, Microsoft, GNU

# EDITOR INTEGRATION

Integrations available for VS Code, CLion, Vim, Emacs, Sublime Text, and most major editors.

# CAVEATS

Style "file" uses nearest .clang-format in parent directories. Some formatting choices are opinionated and may require configuration adjustments.

# SEE ALSO

[clang](/man/clang)(1), [clang-tidy](/man/clang-tidy)(1)
