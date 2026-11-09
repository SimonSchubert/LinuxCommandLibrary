# TAGLINE

Generate and validate Apple App Clip Codes

# TLDR

**List** the default color pairs

```AppClipCodeGenerator templates```

**Generate** a scan-only App Clip Code with a default color pair

```AppClipCodeGenerator generate --url [https://example.com] --index [9] --output [output.svg]```

**Generate** a code without the App Clip logo

```AppClipCodeGenerator generate --url [https://example.com] --index [9] --logo none --output [output.svg]```

**Generate** an NFC-integrated App Clip Code

```AppClipCodeGenerator generate --url [https://example.com] --index [9] --type nfc --output [output.svg]```

**Generate** with custom colors

```AppClipCodeGenerator generate --url [https://example.com] --foreground [123456] --background [FFFFFF] --output [output.svg]```

**Validate colors** and get suggestions

```AppClipCodeGenerator suggest --foreground [65D212] --background [5B1637]```

# SYNOPSIS

**AppClipCodeGenerator** \<command\> [_options_]

# PARAMETERS

**generate**
> Generate an App Clip Code SVG file

**suggest**
> Validate color combinations and get suggestions

**templates**
> List the default color pairs with their index and hex values

**--url** _URL_
> The URL that opens when the App Clip Code is scanned

**--type** _cam|nfc_
> Code type: **cam** for camera-only scanning or **nfc** for NFC-integrated codes

**--index** _N_
> Use the default color pair with this index, as listed by **templates**

**--logo** _none_
> Pass **none** to omit the App Clip logo

**--foreground** _RRGGBB_
> Foreground color as a hex value

**--background** _RRGGBB_
> Background color as a hex value

**--output** _path_
> Output path for the generated SVG file

# DESCRIPTION

**AppClipCodeGenerator** is Apple's official command-line tool for creating and validating App Clip Codes. App Clip Codes are visually distinctive, scannable codes that launch App Clip experiences on iOS devices, lightweight app experiences that can be discovered without installing the full app.

The tool generates App Clip Codes as SVG files with two code types: **cam** codes that are scannable by the device camera, and **nfc** codes that additionally support Near Field Communication for tap-to-open functionality. The **suggest** command validates that foreground and background color combinations meet Apple's contrast and readability requirements.

App Clip Codes encode a URL that maps to a registered App Clip experience through Apple's App Store Connect configuration.

# CAVEATS

Available only on **macOS** as part of Apple's developer tools. The tool must be downloaded separately from Apple's App Clip resources page, requires Apple Developer Program enrollment, and installs to `/Library/Developer/AppClipCodeGenerator`. App Clip Codes can only encode a limited amount of information, so long URLs are rejected. Generated codes require a registered App Clip experience configured in **App Store Connect** to function. Color combinations must meet Apple's contrast requirements: use the **suggest** command to validate colors before generating.

# HISTORY

App Clips were introduced by **Apple** at **WWDC 2020** with **iOS 14** as a way to provide focused app experiences discoverable through Safari, Maps, NFC tags, and QR codes. App Clip Codes and AppClipCodeGenerator followed in **December 2020**. The code generator tool enables developers to create the proprietary App Clip Code format that is visually distinct from standard QR codes.

# SEE ALSO

[xcodebuild](/man/xcodebuild)(1), [xcrun](/man/xcrun)(1)

# RESOURCES

```[Documentation](https://developer.apple.com/documentation/appclip/creating-app-clip-codes-with-the-app-clip-code-generator)```

<!-- verified: 2026-11-09 -->
