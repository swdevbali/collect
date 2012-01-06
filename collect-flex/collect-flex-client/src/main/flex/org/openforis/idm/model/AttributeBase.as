/**
 * Generated by Gas3 v2.2.0 (Granite Data Services).
 *
 * WARNING: DO NOT CHANGE THIS FILE. IT MAY BE OVERWRITTEN EACH TIME YOU USE
 * THE GENERATOR. INSTEAD, EDIT THE INHERITED CLASS (Attribute.as).
 */

package org.openforis.idm.model {

    import flash.utils.IDataInput;
    import flash.utils.IDataOutput;

    [Bindable]
    public class AttributeBase extends Node {

        private var _metadata:AttributeMetadata;
        private var _value:Object;

        public function set metadata(value:AttributeMetadata):void {
            _metadata = value;
        }
        public function get metadata():AttributeMetadata {
            return _metadata;
        }

        public function set value(value:Object):void {
            _value = value;
        }
        public function get value():Object {
            return _value;
        }

        override public function readExternal(input:IDataInput):void {
            super.readExternal(input);
            _metadata = input.readObject() as AttributeMetadata;
            _value = input.readObject() as Object;
        }

        override public function writeExternal(output:IDataOutput):void {
            super.writeExternal(output);
            output.writeObject(_metadata);
            output.writeObject(_value);
        }
    }
}