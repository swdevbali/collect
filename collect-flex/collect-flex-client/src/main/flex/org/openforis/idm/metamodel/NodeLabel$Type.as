/**
 * Generated by Gas3 v2.2.0 (Granite Data Services).
 *
 * WARNING: DO NOT CHANGE THIS FILE. IT MAY BE OVERWRITTEN EACH TIME YOU USE
 * THE GENERATOR.
 */

package org.openforis.idm.metamodel {

    import org.granite.util.Enum;

    [Bindable]
    [RemoteClass(alias="org.openforis.idm.metamodel.NodeLabel$Type")]
    public class NodeLabel$Type extends Enum {

        public static const HEADING:NodeLabel$Type = new NodeLabel$Type("HEADING", _);
        public static const INSTANCE:NodeLabel$Type = new NodeLabel$Type("INSTANCE", _);
        public static const NUMBER:NodeLabel$Type = new NodeLabel$Type("NUMBER", _);

        function NodeLabel$Type(value:String = null, restrictor:* = null) {
            super((value || HEADING.name), restrictor);
        }

        override protected function getConstants():Array {
            return constants;
        }

        public static function get constants():Array {
            return [HEADING, INSTANCE, NUMBER];
        }

        public static function valueOf(name:String):NodeLabel$Type {
            return NodeLabel$Type(HEADING.constantOf(name));
        }
    }
}