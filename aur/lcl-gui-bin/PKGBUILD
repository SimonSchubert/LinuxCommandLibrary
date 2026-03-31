# Maintainer: Simon Schubert <sschubert89@gmail.com>
# https://github.com/SimonSchubert/LinuxCommandLibrary

pkgname=lcl-gui-bin
pkgver=3.7.4
pkgrel=1
pkgdesc='Linux command reference and cheat sheets - desktop application'
arch=('x86_64')
url='https://github.com/SimonSchubert/LinuxCommandLibrary'
license=('Apache-2.0')
depends=('hicolor-icon-theme')
provides=('lcl-gui')
conflicts=('lcl-gui')
options=('!strip')

source=("LinuxCommandLibrary-${pkgver}-linux-x86_64.tar.gz::https://github.com/SimonSchubert/LinuxCommandLibrary/releases/download/v${pkgver}/LinuxCommandLibrary-${pkgver}-linux-x86_64.tar.gz")
sha256sums=('ad150e4415ef7756ab5636547bc2fd2402c0f3f3b34f57294b0614e7e03494c7')

package() {
    # Install application files
    install -dm755 "${pkgdir}/opt/lcl-gui"
    cp -r "${srcdir}/LinuxCommandLibrary/"* "${pkgdir}/opt/lcl-gui/"
    chmod -R go-w "${pkgdir}/opt/lcl-gui"

    # Install wrapper script
    install -Dm755 /dev/stdin "${pkgdir}/usr/bin/lcl-gui" << 'EOF'
#!/bin/sh
exec /opt/lcl-gui/bin/LinuxCommandLibrary "$@"
EOF

    # Install desktop entry
    install -Dm644 /dev/stdin "${pkgdir}/usr/share/applications/lcl-gui.desktop" << EOF
[Desktop Entry]
Name=Linux Command Library
Comment=Linux command reference and cheat sheets
Exec=lcl-gui
Icon=lcl-gui
Type=Application
Categories=Utility;
Keywords=Linux;Command;Terminal;Reference;
StartupWMClass=compose-window
Terminal=false
EOF

    # Install icon
    install -Dm644 "${srcdir}/LinuxCommandLibrary/lib/LinuxCommandLibrary.png" \
        "${pkgdir}/usr/share/icons/hicolor/256x256/apps/lcl-gui.png" 2>/dev/null || \
    install -Dm644 /dev/null "${pkgdir}/usr/share/icons/hicolor/256x256/apps/lcl-gui.png"

    # Install license
    install -Dm644 "${srcdir}/LinuxCommandLibrary/lib/LinuxCommandLibrary.copyright" \
        "${pkgdir}/usr/share/licenses/${pkgname}/LICENSE" 2>/dev/null || true
}
