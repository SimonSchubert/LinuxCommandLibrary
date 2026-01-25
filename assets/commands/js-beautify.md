# TLDR

**Beautify JavaScript file**

```js-beautify [file.js]```

**Beautify and save in place**

```js-beautify -r [file.js]```

**Beautify HTML**

```html-beautify [file.html]```

**Beautify CSS**

```css-beautify [file.css]```

**Set indentation**

```js-beautify -s [4] [file.js]```

**Use tabs**

```js-beautify -t [file.js]```

**Output to file**

```js-beautify [input.js] -o [output.js]```

# SYNOPSIS

**js-beautify** [_options_] [_file_...]

# PARAMETERS

**-r**, **--replace**
> Replace file in place.

**-o** _file_
> Output to file.

**-s** _size_
> Indent size (default 4).

**-t**, **--indent-with-tabs**
> Use tabs.

**-e**, **--eol** _chars_
> End of line character.

**-n**, **--end-with-newline**
> End with newline.

**--type** _type_
> Force type: js, html, css.

**-f** _file_
> Input file.

**--config** _file_
> Configuration file.

# DESCRIPTION

**js-beautify** formats JavaScript, HTML, and CSS files with consistent indentation and style. It's useful for cleaning up minified code or enforcing consistent formatting.

The tool provides separate commands for each language (js-beautify, html-beautify, css-beautify) or auto-detects based on extension.

# CONFIGURATION

```json
// .jsbeautifyrc
{
  "indent_size": 2,
  "indent_with_tabs": false,
  "end_with_newline": true,
  "brace_style": "collapse"
}
```

# CAVEATS

May alter code semantics in edge cases. Large files may be slow. Doesn't validate code. Configuration precedence can be complex.

# HISTORY

js-beautify was created by **Einar Lielmanis** as an online tool, later expanded to a command-line tool and library. It's widely used for code formatting and reversing minification.

# SEE ALSO

[prettier](/man/prettier)(1), [eslint](/man/eslint)(1), [uglifyjs](/man/uglifyjs)(1)
