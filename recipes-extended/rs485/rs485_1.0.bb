SUMMARY = "rs485 tool"
DESCRIPTION = "A simple tool to send and receive data over a tty which is rs485 capable"
HOMEPAGE = "https://github.com/netmodule/rs485.git"
SECTION = "support/rs485"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7702f203b58979ebbc31bfaeb44f219c"

SRCREV = "5bfe60145fc0ee0ef6a6e6f22c8fbf8cf7fe9f1c"
SRC_URI = "git://github.com/netmodule/rs485.git;protocol=https"

S = "${WORKDIR}/git"

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"

do_install() {
    oe_runmake DESTDIR=${D} install
}
