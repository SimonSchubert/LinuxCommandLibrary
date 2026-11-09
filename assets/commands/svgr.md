# TAGLINE

Transform SVG files into React components

# TLDR

**Convert an SVG and print the component**

```svgr [icon.svg]```

**Output to a file**

```svgr [icon.svg] > [Icon.jsx]```

**Convert a directory**

```svgr --out-dir [components/] -- [icons/]```

**Generate TypeScript**

```svgr --typescript --out-dir [components/] -- [icons/]```

**Use icon sizing** (1em width and height)

```svgr --icon [icon.svg]```

**Replace an attribute value**

```svgr --replace-attr-values "[#fff]=[currentColor]" [icon.svg]```

**With a custom template**

```svgr --template [template.js] [icon.svg]```

# SYNOPSIS

**svgr** [_options_] _file_

**svgr** **--out-dir** _dir_ [_options_] **--** _src-dir_

# PARAMETERS

**-d**, **--out-dir** _DIR_
> Output files into a directory.

**--ignore-existing**
> Ignore existing files when used with **--out-dir**.

**--ext** _EXT_
> Custom file extension (default: js).

**--filename-case** _CASE_
> Filename case: pascal, kebab, camel or snake (default: pascal).

**--typescript**
> Transform SVG into TypeScript.

**--native**
> Add React Native support with react-native-svg.

**--icon** [_SIZE_]
> Specify width and height (default: 1em, or 24dp for native).

**--memo**
> Add React.memo to the component.

**--ref**
> Forward ref to the SVG root element.

**--template** _FILE_
> Custom component template.

**--index-template** _FILE_
> Custom index.js template.

**--no-index**
> Disable index file generation.

**--no-prettier**, **--no-svgo**
> Disable Prettier or SVGO.

**--config-file** _FILE_
> Path of the SVGR config.

**--silent**
> Suppress output.

# DESCRIPTION

**svgr** transforms SVG files into React components, generating JSX code that can be imported and used directly in React applications. This eliminates the need to manage separate SVG asset files and enables dynamic styling and prop-based customization of icons and illustrations.

The tool supports TypeScript output and custom component templates. Converting a directory with **--out-dir** processes the whole tree and generates an index file. Input can also be read from stdin, and single-file results are written to stdout.

SVGR integrates with webpack, Rollup, and other bundlers as a loader/plugin, and also works as a standalone CLI or Node.js API. It runs SVGO and Prettier on the output unless disabled.

# CAVEATS

React specific and requires Node.js. There is no **-o** option: redirect stdout for a single file, or use **--out-dir**. The CLI is distributed as **@svgr/cli** and is often run as `npx @svgr/cli`.

# HISTORY

**SVGR** was created by **Greg Bergé** to transform SVG files into React components, simplifying icon usage in React applications.

# SEE ALSO

[svgo](/man/svgo)(1), [react-scripts](/man/react-scripts)(1)

# RESOURCES

```[Homepage](https://react-svgr.com)```

```[Source code](https://github.com/gregberge/svgr)```

```[Documentation](https://react-svgr.com/docs/cli/)```

<!-- verified: 2026-11-09 -->
