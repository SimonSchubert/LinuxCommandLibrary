# TAGLINE

Transform SVG files into React components

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

**svgr** transforms SVG files into React components, generating JSX code that can be imported and used directly in React applications. This eliminates the need to manage separate SVG asset files and enables dynamic styling and prop-based customization of icons and illustrations.

The tool supports TypeScript output with proper type definitions, named and default exports, and various component patterns. Batch conversion processes entire directories of SVG files into a component library with an automatic index file. Custom templates control the exact shape of generated component code.

SVGR integrates with webpack, Rollup, and other bundlers as a loader/plugin, and also works as a standalone CLI or Node.js API. It optionally runs SVGO optimization before generating components.

# CAVEATS

React specific. Node.js required. JSX output.

# HISTORY

**SVGR** was created to transform SVG files into React components, simplifying icon usage in React applications.

# SEE ALSO

[svgo](/man/svgo)(1), [react-scripts](/man/react-scripts)(1)
