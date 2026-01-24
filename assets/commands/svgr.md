# TLDR

**Convert SVG to React**

```svgr [icon.svg]```

**Output to file**

```svgr [icon.svg] -o [Icon.jsx]```

**Convert directory**

```svgr [icons/] -d [components/]```

**With TypeScript**

```svgr --typescript [icon.svg]```

**As named export**

```svgr --export-type named [icon.svg]```

**With custom template**

```svgr --template [template.js] [icon.svg]```

# SYNOPSIS

**svgr** [_-o file_] [_-d dir_] [_--typescript_] [_options_] _input_

# PARAMETERS

**-o** _FILE_
> Output file.

**-d** _DIR_
> Output directory.

**--typescript**
> TypeScript output.

**--export-type** _TYPE_
> Export style.

**--template** _FILE_
> Custom template.

**--icon**
> Icon mode (1em size).

# DESCRIPTION

**svgr** transforms SVG to React. It generates components.

React component output. JSX format.

TypeScript support. Type definitions.

Batch conversion. Directory processing.

Customizable templates. Control output.

# CAVEATS

React specific. Node.js required. JSX output.

# HISTORY

**SVGR** was created to transform SVG files into React components, simplifying icon usage in React applications.

# SEE ALSO

[svgo](/man/svgo)(1), [react-scripts](/man/react-scripts)(1)
